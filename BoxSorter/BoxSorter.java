/*
 * Written by Savanna Shaver
 */
import java.util.Scanner;
public class BoxSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Welcome to the box sorter!\nEnter the information about boxes and I'll sort them");
	Scanner keyboard = new Scanner(System.in);
	Box[] boxes = new Box[5];
	for(int i=0; i<boxes.length;i++)
	{
		System.out.println("Enter the label, length, width and height (all feet) of box"+(i + 1));
		String label = keyboard.nextLine();
		double l = keyboard.nextDouble();
		double w = keyboard.nextDouble();
		double h = keyboard.nextDouble();
		keyboard.nextLine();
		Box aBox = new Box(label,l,w,h);
		boxes[i] = aBox;
	}
	boolean hasSwapped = true;
	while(hasSwapped == true)
	{
		hasSwapped = false;
		for(int i = 0; i< boxes.length-1; i++)
		{
			if(boxes[i].getVolume() > boxes[i +1].getVolume())
			{
				//bubble sort allows to sort the higher volume boxes first.
				Box temp = boxes[i];
				boxes[i] = boxes[i +1];
				boxes[i+1] = temp; 
				hasSwapped = true;
			}
		}
	}
	System.out.println("Sorted boxes");
	for(Box b : boxes)
	{
		System.out.println(b);
	}
}

}
