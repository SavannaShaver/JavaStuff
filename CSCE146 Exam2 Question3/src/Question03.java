

/*
 * <<Savanna Shaver>>
 * CSCE 146 Exam02 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Question03 
{
	public class Node //public for testing purposes
	{
		private Book data;
		private Node leftChild;
		private Node rightChild;
		public Node(Book aData)
		{
			this.data = aData;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
	public Node root; //public for testing purposes
	public boolean search(Book aData)
	{
//-----------------------------------------------------------------------------------
		//Write your solution here
		return search(root, aData);
		
	}//Do not alter this
	//Write additional methods or properties here
		private boolean search(Node aNode, Book aData)
		{
				if(aNode == null)
					return false;
				else if(aData.compareTo(aNode.data)<0)
					return search(aNode.leftChild,aData); 
				else if(aData.compareTo(aNode.data)>0)
					return search(aNode.rightChild,aData);
				else
					return true; 
						
			
		}
	
	//--------------------------------------------------------------------------------
//Do not alter------------------------------------------------------------------------
	public void createTree()
	{
		this.root = new Node(new Book("aaaaa"));
		this.root.leftChild = new Node(new Book("aa"));
		this.root.leftChild.leftChild = new Node(new Book("a"));
		this.root.leftChild.rightChild = new Node(new Book("aaa"));
		this.root.rightChild = new Node(new Book("aaaaaaa"));
		this.root.rightChild.leftChild = new Node(new Book("aaaaaa"));
		this.root.rightChild.rightChild = new Node(new Book("aaaaaaaaa"));
	}
//-----------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		Question03 tree = new Question03();
		tree.createTree();
		
		System.out.println("Does it find the book titled \"aa\"? "+tree.search(new Book("aa")));
		System.out.println("Does it find the book titled \"aaaaaaaaa\"? "+tree.search(new Book("aaaaaaaaa")));
		System.out.println("Does it find the book titled \"c\"? "+tree.search(new Book("c")));

	}
	//--------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * For this problem I created a Binary Search Tree of Books. The main component I added was the two search method one is a 
 * public void search that takes in the titles from the books. Its also the method that tells the program to start at the 
 * root. The other method search is a boolean method so it only returns true or false and its job is to compare
 * the values of the book titles to the values in the tree node's and returns whether the title name being looked for in 
 * in the main method is actually in the tree. I had to use recursion to call it so that it runs through the whole tree. If the title
 * data compared to the node's data is less than it will go to the left and if the books data is greater than the node's data it
 * will go to the right and it will continue to do this till it either finds no matches in the tree and returns false or 
 * if the name is in the tree it will return true. The only  thing is the createTree() function has to enter book names in tree format
 * for it to work with the way its suppose too.
 */
