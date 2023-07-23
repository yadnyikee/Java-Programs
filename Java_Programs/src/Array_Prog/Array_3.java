package Array_Prog;

public class Array_3 
{
	public static void main(String[] args) 
	{
		// String s2[] = new String[-4]; No negativeArraySizeException.
		
		String s1[] = new String[5];
		
		s1[0]="Rashmi";
		s1[1]="Bhiate";
		s1[2]="Kolhapur";
		s1[3]="982294";
		s1[4]="@#$%";
		
		System.out.println(s1.length);
		
		System.out.println();
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
	}
}
