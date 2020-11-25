/*
 * Written by Savanna Shaver
 */
public class LinkedBST <T extends Comparable<T>> { // we have this extends etc to make the object comparable
	private class Node //holds data and refrences 
	{
		T data;
		Node leftChild; // we have at least a  left and right child in our tree always
		Node rightChild;
		public Node(T aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	private Node root; // head in LL
	public LinkedBST() // Constructor
	{
		root = null;
	}
	
	public void add(T aData)// adding to my tree
	{
		if(root == null) // halting condtion
			root = new Node(aData); // so if root is null then it will create a node
		else
			add(root, aData); // im calling the method below me to occur when we have values
	
	}
	private Node add(Node aNode, T aData)
	{
		if(aNode == null)
		{
			aNode  = new Node(aData);// we construct and instance of our node and assigns it a data value
		}
		else if(aData.compareTo(aNode.data)<0) // less than 0 is LEFT this wouldnt be compareable without the <0
		{
			aNode.leftChild = add(aNode.leftChild,aData); // this is changing the current leftChild to the aData value of the leftChild
		}
		else if(aData.compareTo(aNode.data)>0) // >0 is right
		{
			aNode.rightChild = add(aNode.rightChild,aData); // this is changing the current rughtChild to the aData value of the rightChild
		}
		return aNode;
 		
	}
	public void printPreorder()
	{
		printPreorder(root); // prints from the root
	}
	private void printPreorder(Node aNode)
	{
		//going to be recursive 
		if(aNode == null) // halting conditions
			return;
		System.out.println(aNode.data); //Process
		printPreorder(aNode.leftChild); // we move left finding all the nodes left
		printPreorder(aNode.rightChild); // now we go right ot find the right nodes
	}
	public void printInorder()
	{
		printInorder(root);
		
	}
	private void printInorder(Node aNode)
	{
		if(aNode == null)
		{
			return;
		
		}
		printInorder(aNode.leftChild); //left
		System.out.println(aNode.data); //Process
		printInorder(aNode.rightChild);
	}
	public void printPostorder()
	{
		printPostorder(root);
	}
	public void printPostorder(Node aNode)
	{
		if(aNode == null)
			return;
		printPostorder(aNode.leftChild);
		printPostorder(aNode.rightChild);
		System.out.println(aNode.data);
	}
	public boolean search(T aData)
	{
		return search(root,aData);
	}
	private boolean search(Node aNode, T aData)
	{
		if(aNode == null)// we dont have the value in the tree
			return false;
		else if(aData.compareTo(aNode.data)<0) // means the value is less than the root so we go left
			return search(aNode.leftChild,aData); 
		else if(aData.compareTo(aNode.data)>0)// means go right
			return search(aNode.rightChild,aData);
		else
			return true; //we know the value equals the value called so return true
				
	}
	public void remove(T aData)
	{
		root = remove(root,aData);
	}
	private Node remove(Node aNode, T aData) //two children example
	{
		//find the node
		if(aNode == null) // means the value wasnt in the tree
			return null;
		else if(aData.compareTo(aNode.data)<0)// go left
		{
			aNode.leftChild = remove(aNode.leftChild, aData);
		}
		else if(aData.compareTo(aNode.data)>0)// go left
		{
			aNode.rightChild = remove(aNode.rightChild, aData);
		}
		else // found the value
		{
			if(aNode.rightChild == null)
				return aNode.leftChild; 
			else if(aNode.leftChild == null)
				return aNode.rightChild;
			//Todo find smallest
			Node temp = findMinTree(aNode.rightChild); // this finds the smallest value in this trees right side
			aNode.data = temp.data;
			aNode.rightChild = remove(aNode.rightChild,temp.data);
		}
		return aNode;
		
	}
	private Node findMinTree(Node aNode) // finds the smallest value in the tree
	{
		if(aNode == null)
			return null;
		else if(aNode.leftChild == null)
			return aNode;
		else 
			return findMinTree(aNode.leftChild);
	}
	}
