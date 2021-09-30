package javaday7;

import java.util.Scanner;

public class Program1 
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		String arr[] = new String[3];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.next();
		}
		System.out.println("print the string array ...");
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		
	}

}
