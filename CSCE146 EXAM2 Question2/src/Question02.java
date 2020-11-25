/*
 * <<Savanna Shaver>>
 * CSCE 146 Exam02 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Question02 
{
	public class Node //public for testing purposes
	{
		private Game data;
		private Node leftChild;
		private Node rightChild;
		public Node(Game aData)
		{
			this.data = aData;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
	public Node root; //public for testing purposes
	public void add(Game aData)
	{
//-----------------------------------------------------------------------------------
		//Write your solution here

		if(root == null)
			root = new Node(aData);
		else
			add(root,aData);
	}//Do not alter this
	//Write additional methods or properties here
	private Node add(Node aNode, Game aData)
	{
		if(aNode == null)
			aNode = new Node(aData);
		else if (aData.compareTo(aNode.data)<0)
			aNode.leftChild = add(aNode.leftChild, aData);
		else if(aData.compareTo(aNode.data)>0)
			aNode.rightChild = add(aNode.rightChild, aData);
		return aNode;
		
	}
	//--------------------------------------------------------------------------------
//Do not alter------------------------------------------------------------------------
	public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(Node aNode)
	{
		if(aNode == null)
		{
			System.out.print("leaf, ");
			return;
		}
		System.out.print(aNode.data+", ");
		printPreorder(aNode.leftChild);
		printPreorder(aNode.rightChild);
	}
//-----------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{

		Game[] games = {new Game(80.0),
				new Game(60.0),
				new Game(40.0),
				new Game(20.0),
				new Game(10.0),
				new Game(70.0),
				new Game(50.0),
				new Game(30.0)};
		Question02 tree = new Question02();
		for(Game g: games)
			tree.add(g);
		tree.printPreorder();

	}
	//--------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * 
 * For this problem to create the add function for a Binary Search Tree I created two add methods. 
 * One method was public void add that took in the games data and will construct a new Node for the root 
 * if the tree is empty otherwise it will then recursively call the
 * other add method from the root till the end of the tree. The other add method 
 * returns the reference to the nodes, in that method I passed in the node's
 * data and the games data. Then inside the method I created an if statement it checks if a Node is
 * null also know as a leaf. Then it will create a new Node and add the data given to it. If the Node
 * isnt null then the program will check if the game data is less than the node's data and we will move
 * to the left of the tree for as long as that remains true otherwise if the game data is greater than the
 * node's data then it will go to the right of the tree and it will go through either side until it reaches 
 * a null element also known as the leaf and replace it accordingly.
  
 * 
 * 
 *
 *  
 *  
 */
