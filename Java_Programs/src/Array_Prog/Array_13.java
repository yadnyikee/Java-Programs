package Array_Prog;

public class Array_13 
{
	// Sum of array
	public static void main(String[] args)
	{
		int array[] = {1,2,3,4,5,6,7};
		
		System.out.println(array.length);
		
		int sum=0;
		
		for(int i=0; i < array.length; i++)
		{
			sum = sum + array[i];
			System.out.println(sum);
		}
	}
	
	
	
	
}
