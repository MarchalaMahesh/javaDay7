package javaday7;

public class Find2ndSmallestNumber
{
public static void main(String[] args) 
	
	{
		
		int arr[] = {16,34,67,87,221,3,1,100};
		
		
		System.out.println("original array ");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		
		int smallest1=arr[0];
		int smallest2 = arr[0];
		
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]<smallest1)
			{
				smallest2=smallest1;
				smallest1=arr[i];
				
			}
			else if(arr[i]<smallest2)
			{
				smallest2=arr[i];
			}
		}
		System.out.println("2nd smallest Number is :"+smallest2);
		
	}

	

}
