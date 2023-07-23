package Array_Prog;

public class Array_6 
{
	public static void main(String[] args) 
	{
		Object []o1 =new Object[5];
		
		o1[0]="Riya";
		o1[1]=10.11;
		o1[2]=true;
		o1[3]='A';
		o1[4]=10;
		
		System.out.println(o1.length);
		
		System.out.println();
		
		for(int i=0; i<o1.length; i++)
		{
			System.out.println(o1[i]);
		}
				
	}
}
