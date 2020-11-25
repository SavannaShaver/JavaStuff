/*
 * Savanna Shaver 
 */
import java.util.Scanner;
public class MatrixSubtractionLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the matrix subtracting program");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the length of the first matrix");
		int lengthFirst = keyboard.nextInt();
		System.out.println("Please enter the height of the first matrix");
		int heightFirst = keyboard.nextInt();
		
		System.out.println("Please enter the length of the second matrix");
		int l2 = keyboard.nextInt();
		System.out.println("Please enter the height of the second matrix");
		int h2 = keyboard.nextInt();
		
		System.out.println();
		// we want to the enter the values to each matriz and store its number of inputs of each matrix 
		
		if(lengthFirst != l2 || heightFirst != h2)
		{
		 System.out.println("Doesnt match");
		 System.exit(0);
		}
		
		
		int[][] matrix1 = new int[lengthFirst][heightFirst];
		//matrix1[0][0]--> matrix1[1][0]
		for(int i = 0; i < lengthFirst; i++)
		{
			//System.out.printlsn("_");
			for(int j = 0; j < heightFirst; j++)
			{
				System.out.println("Please enter a value for matrix 1 space " + (i+ 1) + "," +(j+1)+"");
				matrix1[i][j] = keyboard.nextInt();
			 }
				 
			
			
		}	
		
		System.out.println();
		
		
		int[][] matrix2 = new int[l2][h2];
		//matrix1[0][0]--> matrix1[1][0]
		for(int i = 0; i < l2; i++)
		{
			for(int j = 0; j < l2; j++)
			{
			 
				System.out.println("Please enter a value for matrix 2 space " + (i+ 1) + "," +(j+1)+"");
				matrix2[i][j] = keyboard.nextInt();
				System.out.println(matrix2[i][j]);
				 
			}
			
		}	
			
		
		int[][] matrix3 = new int[lengthFirst][heightFirst];
		//matrix1[0][0]--> matrix1[1][0]
		for(int i = 0; i < lengthFirst; i++)
		{
			
			for(int j = 0; j < heightFirst; j++)
			{
			 
				matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
				 
			}
			System.out.println();
			
		}
		
		
			
			
		for(int i = 0; i < lengthFirst; i++)
		{
			for(int j = 0; j < heightFirst; j++)
			{
				System.out.print(matrix1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-");
		
		for(int i = 0; i < l2; i++)
		{
			for(int j = 0; j < h2; j++)
			{
				System.out.print(matrix2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("=");
		
		
		for(int i = 0; i < lengthFirst; i++)
		{
			for(int j = 0; j < heightFirst; j++)
			{
				System.out.print(matrix3[i][j]);
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
			

	}

}
