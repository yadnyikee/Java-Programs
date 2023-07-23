package Array_Prog;

public class Array_1
{
	public static void main(String[] args) 
	{
		// Array is a collection of sililar elements and values.
		// In array we can stored only fixed set of elements.
		// Array is index based and index always starts with 0th index.
		
		// Array declration
		// Syntax = datatype arr_name[] = new datatype[size of array];
		
		int array[] = new int[10];
		
		// Array initilization 
		// Syntax = array_name[indexnumber];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[5] = 60;
		array[6] = 70;
		array[7] = 80;
		array[8] = 90;
		array[9] = 100;
		
		// To check length of array we have follow below statement
		
		System.out.println(array.length);
		System.out.println();
		
		//Array usage
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		System.out.println();
		
		System.out.println("Index - 2 is : " +array[2]);
		System.out.println("Index - 3 is : " +array[3]);
		System.out.println();
		
		// System.out.println("Index - 11 is : "+array[11]);it will show error array outofbound or indx.
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
	}
}
