package javaday7;

import java.util.Arrays;

public class DescendingOrder {
	public static void main(String[] args) 
	{
     int arr[] = {16,34,67,87,221,3,1};
     
     System.out.println("original array ");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println("descending order");
		for(int i=arr.length-1;i>=0;i--)
		{
		System.out.print(arr[i]+" ");
		
		
	}


}
}