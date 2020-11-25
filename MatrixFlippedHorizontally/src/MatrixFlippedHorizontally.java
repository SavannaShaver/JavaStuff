/*
 * Savanna Shaver
 */
import java.util.Random;
import java.util.Scanner;
public class MatrixFlippedHorizontally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Created Matrix");
	Random rand = new Random(); //this is the random function
	
	int[][] matrix = new int[10][10];
	for(int i = 0; i<matrix.length ; i++ )
	{
		for(int j = 0; j < matrix.length; j++)
		{
		matrix[i][j]= rand.nextInt(9); // gets the random num and tells thats what it will equal
		System.out.print(matrix[i][j] + " ");
		
		}	
	 System.out.println();
	}
	 System.out.println();
	 
	 System.out.println("Matrix flipped horizontally");
	 int[][] matrix2 = new int[10][10];// makes sure the size of the list is 10 by 10
	 
	 for(int i = 0; i<matrix2.length ; i++ )
		{
			for(int j = 0; j < matrix2.length; j++)
			{
			matrix2[i][j]= matrix[i][matrix.length -1 -j ];  // gets the random nums from matrix 1 and prints in reverse 
			System.out.print(matrix2[i][j] + " ");
			
			}	
		 System.out.println();// helps create the box shape 
		}
	
	}

}
