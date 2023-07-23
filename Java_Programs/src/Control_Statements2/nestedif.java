package Control_Statements2;
public class nestedif 
{
	public static void main(String[] args)
	{
		int a = 500;
		int b = 400;
		int c = 300;
		
		if(a>b) // 500 > 400 True
		{ 
			if(a>c) // 500 > 300 True
			{
			  System.out.println("A is greater"); 
			}
		}
		else if(b>a) // 400>300
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
	}
}
