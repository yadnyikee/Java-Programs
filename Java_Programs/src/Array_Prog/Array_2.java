package Array_Prog;
import java.util.Arrays;

public class Array_2 
{
	public static void main(String[] args) 
	{
		int array[] = new int[5];
		
		array[0] = 6;
		array[1] = 2;
		array[2] = 10;
		array[3] = 7;
		array[4] = 1;
		
		System.out.println(array.length);
		System.out.println();
		
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
			
		}
		System.out.println();
		//To sort the aaray
		Arrays.sort(array);
		
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}
