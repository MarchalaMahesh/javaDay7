package javaday7;

public class FindLargestNumber {
	public static void main(String[] args) 
	
	{
		
		int arr[] = {16,34,67,87,221,3,1};
		System.out.println("original array ");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		
		int largest=arr[0];
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("A largest number is "+largest);
		
	}

}
