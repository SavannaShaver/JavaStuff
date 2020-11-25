import java.util.Scanner;
import java.util.*;
import java.io.*;

/*
 * Written By Savanna Shaver
 */
public class shapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Welcome to the shape tree tester!");
	System.out.println("Reading from file");
	Scanner keyboard = new Scanner(System.in);
	String fileName = keyboard.nextLine();
	LinkedBST<Shape> shapeTree = new LinkedBST<Shape>();
	try
	{
		Scanner fileScanner = new Scanner(new File(fileName));
		while(fileScanner.hasNextLine())
		{
			String currLine = fileScanner.nextLine();
			String[] splitLine = currLine.split("\t");
			Shape f = new Shape(Integer.parseInt(splitLine[2]),(splitLine[1]),splitLine[0]);
			shapeTree.add(f);
		//	String[] splitLine = currLine.split("\t");
			
			//System.out.println(currLine);
		
		}
		fileScanner.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("Printing the in-order traversal");
	shapeTree.printInorder();
	System.out.println("\nPrinting the pre-order traversal");
	shapeTree.printPreorder();
	System.out.println("\nPrinting the post-order traversal");
	shapeTree.printPostorder();
	
	
	}

}
