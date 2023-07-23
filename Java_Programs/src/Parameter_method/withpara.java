package Parameter_method;

public class withpara 
{
	public static void main(String[] args) 
	{
		
		add(20,30);
		
		withpara.add(10,20);
		withpara.sub(50,20);
	}
	
	public static void add(int a, int b)
	{
		int c=a+b;
		System.out.println();
		System.out.println("Addition of two number is :"+ c);
	}
	
	public static void sub(int a, int b)
	{
		int c=a-b;
		
		System.out.println();
		System.out.println("Substraction of two number is :" +c);
	}

}
