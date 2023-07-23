package Array_Prog;

public class Array_10 
{
	public static void main(String[] args) 
	{
		//Duplicate array
		
		int arr[] = {2,4,5,6,6,7,2,3};
		
		System.out.println("Duplicate element in given array");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				
				}
			}
		}
	}
}
