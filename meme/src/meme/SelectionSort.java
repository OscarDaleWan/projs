package meme;

public class SelectionSort 
{
	public static void main(String[] args)
	{
		int[] array = { -13,-10,28,31,-40,26,25,-33 };
		selectionSort(array);
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int min = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < arr[min])
				{
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			for(int k = 0; k < arr.length; k++)
			{
				System.out.print(arr[k] + ",");
			}
			System.out.println();
		}
		
	}
}

	