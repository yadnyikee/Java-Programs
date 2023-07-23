package Array_Prog;

public class Array_4 
{
	public static void main(String[] args)
	{
		boolean b1[] = new boolean[4];
		
		b1[0]=true;
		b1[1]=false;
		b1[2]=true;
		b1[3]=false;
		//b1[4]=test;
		
		System.out.println(b1.length);
		System.out.println();
		
		for(int i=0; i<b1.length; i++)
			{
				System.out.println(b1[i]);
			}
			}
}
