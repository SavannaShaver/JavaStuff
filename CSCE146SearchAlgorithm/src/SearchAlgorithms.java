
public class SearchAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,6,7,8,9,10,11,12};
		System.out.println(linearSeach(array,11));// will return true if the value 11 is in the array
		

	}
	public static boolean linearSeach(int[] a, int target)
	{
		for(int i = 0; i<a.length; i++) // for the length of the array check each num
			if(a[i] == target) // if the value a is the target then return true 
				return true;
		return false; // this means it wasnt found in the array
			
	}
	public static boolean binarySearh(int[] a, int target, int start, int end)
	{
		if(start > end)
			return false;
		int mid = (start+end)/2;
		if(a[mid] == target)
			return true;
		else if(a[mid] > target) // this means the middle index target is larger than the value
			return binarySearh(a,target,start,mid-1); //recursive method, it will start from the same place but the midde will be minus 1
		else
		    return binarySearh(a,target,mid+1,end);	
	}

}
