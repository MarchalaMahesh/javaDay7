package javaday7;

import java.util.Scanner;

public class RightRotate 


{
	public static void main(String[] args) {
		
	
	int arr[] = {16,34,67,87,221,3,1};
	
	System.out.println("original array ");
	for(int k=0;k<arr.length;k++)
	{
		System.out.print(arr[k]+" ");
	}
	System.out.println();
	
	int n=1;
	
	for(int i=0;i<n;i++)
	{
		int last=arr[arr.length-1];
		for(int j=arr.length-1;j>0;j--)
		{
			arr[j]=arr[j-1];
			
		}
		arr[0]=last;
	}
	System.out.println();
	
	System.out.println("after right rotation");
	
	for(int l=0;l<arr.length;l++)
	{
		System.out.print(arr[l]+" ");
	}
}
}