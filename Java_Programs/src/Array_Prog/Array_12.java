package Array_Prog;

public class Array_12 
{
	public static void main(String[] args) 
	{
		//Reverse number
		int arr[] = {2,3,4,5,67,8,9,5};
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("Reserve Array");
		
		for(int j=7;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}
}
