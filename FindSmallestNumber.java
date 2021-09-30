package javaday7;

public class FindSmallestNumber 
{

public static void main(String[] args) 
	
	{
		
		int arr[] = {16,34,67,87,221,3,1};
		System.out.println("original array ");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		int smallest=arr[0];
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("A smallest number is "+smallest);
		
	}
	
	
}
