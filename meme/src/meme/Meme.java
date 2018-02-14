package meme;

public class Meme 
{
	//binary search
	public static int[] array()
	{
		int[] numbers = {-1,  3,  5,  8, 15, 18, 22, 39, 40, 42, 50, 57, 71, 73, 74};
		return numbers;
	}
	public static int binarySearch(int targ)
	{
		int[] arr = array();
		int min = 0;
		int max = arr.length + 1;
		int num = 0;
		
		while(min <= max)
		{
			int mid = (min + max) / 2;
			
			if(arr[mid] < targ)
			{
				min = mid + 1;
			}
			else if(arr[mid] > targ)
			{
				max = mid - 1;
			}
			else
			{
				return mid;
			}
			num++;
		}
		return -1;
	}
}
