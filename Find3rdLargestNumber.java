package javaday7;

public class Find3rdLargestNumber {
	public static void main(String[] args) {
int arr[] = {16,34,67,87,221,3,1,100};
System.out.println("original array ");
for(int k=0;k<arr.length;k++)
{
	System.out.print(arr[k]+" ");
}
System.out.println();
		
		int largest1=arr[0];
		int largest2 = arr[0];
		int largest3=arr[0];
		
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>largest1)
			{
				largest2=largest1;
				largest1=arr[i];
				
			}
			else if(arr[i]>largest2)
			{
				largest3=largest2;
				largest2=arr[i];
			}
			else if(arr[i]>largest3)
			{
				largest3=arr[i];
			}
				
		}
		System.out.println("3rd Largest Number is :"+largest3);
	}

}
