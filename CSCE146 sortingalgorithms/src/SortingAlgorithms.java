/*
 * Written by Savanna Shaver
 */
public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,8,7,6,12,5,11,9};// populate array
		mergeSort(array);
		for(int i: array)
			System.out.println(i);
		
		quickSort(array);
		for(int i: array)
			System.out.println(i);
		
	}
	
	public static void mergeSort(int[] a) // merge sort isnt just for numbers ? 
	{
		int size = a.length;
		if(size < 2) // we dont want to split the single array any further so we create this halting condition
			return;
		int mid = size/2; // gives us the middle of the array
		int leftSize = mid; // from 0 to the mid
		int rightSize = size - mid; // is the remaining values in the array so array length - mid 
		int[] left = new int[leftSize]; // we have now created the actual array of the left nums
		int[] right = new int[rightSize]; // we havve created a array with the right side values
		for(int i = 0; i< mid; i++) // comparing the index a to the index data of the left array data and setting the points like 0-3 to 0-3 in the leftarray 
			left[i] = a[i];
		for(int i = mid; i < size; i++) // doing the same thing as the left side but for right
		{
			right[i-mid] = a[i];
		} 
		mergeSort(left); // we are trying to make it keep going till each item is one array long
		mergeSort(right);
		//TODO merge
		merge(left,right,a); // this merges the groups back into array a but now should be in order
	}
	public static void merge(int[] left, int[] right, int[] a )
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0; // left array index
		int j = 0; // right array index
		int k = 0; // merged array's a index
		while(i < leftSize && j< rightSize) // we have run through all the values in the left and right array
		{
			if(left[i] <= right[j]) // we have found a smaller value in the left array and we need to add it the array a
			{
				a[k] = left[i]; // this is adding it to array a 
				i++; // increasing the index of i and k to the next spot in each array
				k++;
			}
			else // means the right array has a smaller value
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i<leftSize) // while i is less than the left size we have used all the values in the right array but have numbers still in the left
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<rightSize) // while i is less than the right size we have used all the values in the left array but have numbers still in the right
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	
	public static void quickSort(int[] a) 
	{
		quickSort(a,0,a.length-1); // we call quick sort that runs from the 0 to the length of array a 
	}
	public static void quickSort(int[] a, int start, int end)
	{
		if(start >= end) // if the start is greater than the first index 
			return;
		int pivot = partition(a,start,end);
		quickSort(a,start,pivot-1); // tells the left hand side 
		quickSort(a,pivot+1,end); // gives the pivot till the right hand side
	}
	
	public static int partition(int[] a, int start, int end)
	{
		int pivot = a[end];// the end value of array a 
		int i = start;  // the starting point
		for(int j= start; j<=end; j++) // this will run as many times as the value of the end
		{
			if(a[j] < pivot) // if a is less than the pivot value we need to swap
			{
				
				
					int temp = a[i]; // create temo set it to a at the index its at
					a[i] = a[j]; // now index i equals the value at a[j]
					a[j] = temp; // so a[j] value is the temps new value
					i++; // keeps it going for diff values in the array
				
			}
		}
			int temp = a[i]; // temp equals a at the index
			a[i] = a[end]; // a at the index= the end value of the array a 
			a[end] = temp; // so temp now equals the end value of the array
			return i; // i returns the index where the pivot is 
	}
}
		
	

