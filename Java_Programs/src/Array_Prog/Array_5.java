package Array_Prog;

public class Array_5 
{
	public static void main(String[] args)
	{
		double []d1 = new double[3];
		
		//double d2[] = new double[3];
		
		// Both are correct ways to declare array
		
		d1[0]=10.20;
		d1[1]=23.99;
		d1[2]=33.33;
		
		System.out.println(d1.length);
		System.out.println();
		
		for(int i=0; i<d1.length; i++)
		{
			System.out.println(d1[i]);
		}
	}
}
