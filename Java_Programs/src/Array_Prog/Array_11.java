package Array_Prog;

public class Array_11
{
	public static void main(String[] args)
	{
		// Find largest number
		
		int arr1 [] = {100,200,4000,300,500,1000};
		
		int max = arr1[0];
		
		for(int i=0;i<arr1.length;i++)
		{
			if (arr1[i]>max)
			{
				max = arr1[i];
			}
		}
		System.out.println("Largest Number is : " + max);
	}
}
