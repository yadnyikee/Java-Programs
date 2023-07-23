package Array_Prog;
import java.util.*;

public class Array_8
{
	public static void main(String[] args)
	{
		int a1[] = new int[8];
		a1[0]=89;
		
		int a2[] = {0,20,3,98,23,2,4,5};
		
		System.out.println(a2[3]); //98
		System.out.println(a2[4]); //23
		
		for(int i=0; i<a2.length;i++)
		{
			System.out.println(a2[i]);
		}
		System.out.println();
		
		Arrays.sort(a2);
		for(int i=0;i<a2.length;i++)
		{
			System.out.println(a2[i]);
		}
		}
	
}
