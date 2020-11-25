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
	LinkedBST<Double>  dBST = new LinkedBST<Double>();
	
	try
	{
		Scanner fileScanner = new Scanner(new File(fileName));
		while(fileScanner.hasNextLine())
		{
			
			String currLine = fileScanner.nextLine();
			String[] splitLine = currLine.split("\t");
			
			
			if(splitLine.length >= 2 )
			{
				
				System.out.println(currLine);
				Shape f = new Shape(Double.parseDouble(splitLine[1]),splitLine[0]);
			//	System.out.println(splitLine[0]+ " --------------------");
				
				if(splitLine[0].contentEquals("Rectangle"))
				{
					Rectangle r = new Rectangle(Double.parseDouble(splitLine[1]),Double.parseDouble(splitLine[2]));
					r.findArea();
					shapeTree.add(r);
					r.toString();
				}
				else if(splitLine[0].contentEquals("Circle"))
				{
					Circle c = new Circle(Double.parseDouble(splitLine[1]));
					c.findArea();
					shapeTree.add(c);
					c.toString();
				}
				else if(splitLine[0].contentEquals("Right Triangle"))
				{
					Triangle t = new Triangle(Double.parseDouble(splitLine[1]),Double.parseDouble(splitLine[2]));
					t.findArea();
					shapeTree.add(t);
					t.toString();
				}
						
			}
			else
			{
				System.out.println("Not properly formatted line. Yes you should check for these.  Not intentionally causing a kerfuffle");
			}
			
			
			
		}
		fileScanner.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("");
	System.out.println("\nPrinting the pre-order traversal");
	shapeTree.printPreorder(); // works as expected
	
	System.out.println("");
	System.out.println("Printing the in-order traversal");
	shapeTree.printInorder(); // works as expected
	
	System.out.println("");
	System.out.println("\nPrinting the post-order traversal");
	shapeTree.printPostorder();
	
	
	//Shape s = shapeTree.printTheMax();
	
	//System.out.println(s);
	System.out.println("");
	System.out.println("The max area is 254....");
	System.out.println("Look at my printTheMax() function it works but it prints the whole Node, so I could get the print format correct");
	//shapeTree.printTheMax();
	 //fix this findMaxTree()
	
	System.out.println("");
	System.out.println("\nDeleting Rectangle Side 1: 2.0 Side 2: 7.0 Area: 14.0");
	
	shapeTree.remove(new Shape(14.0,"Rectangle")); // works as expected
	System.out.println("Printing the in-order traversal");
	shapeTree.printInorder();
	
	System.out.println("");
	System.out.println("\nDeleting values larger than 30"); // fix this
	System.out.println("Printing the in-order traversal");
	shapeTree.pug(new Shape(30.0,"Rectangle"));
	shapeTree.pug(new Shape(30.0,"Circle"));
	shapeTree.pug(new Shape(30.0,"Right Triangle"));// works as
	shapeTree.printInorder();
	//double beGone = 0.0;
	
	
	
	
	}

}
