package javaday7;

public class LineaeSearch {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,70};
		
		int key=90;
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				System.out.println("element is found");
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("not found");
		}
	}

}
