
public class Question2Review {
	public static boolean binarySearchRecursive(int[] a, int value, int minIndex, int maxIndex)
	{
		int midIndex = (maxIndex + minIndex)/2;
		if(minIndex > maxIndex)
		{
			return false;
		}
		if(a[midIndex] == value)
		{
			return true;
		}
		else
		{
			if(value > a[midIndex])
			{
				return binarySearchRecursive(a,value,midIndex+1, maxIndex);			}	
			else
			{
				return binarySearchRecursive(a,value,minIndex,midIndex-1);
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5,6,7,8};
		int target = 8;
		System.out.println("Is " + target+ " found in the array? "+ binarySearchRecursive(array,target,0,array.length));
	}
}
