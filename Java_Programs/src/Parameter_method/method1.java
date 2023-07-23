package Parameter_method;

public class method1 
{
	public static void main(String[] args) 
	{
 		add();   // direct
 		
 		method1.add();   // using class name
 		method1.sub();
 		method1.mul();
 		
 		/* method1 obj = new method1();
 		obj.add(); non static method */
	}
	
	public static void add() 
	{
		
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("Addition of two number is : "+c);
		System.out.println();
	}
	
	public static void sub()
	{
		int a=50;
		int b=30;
		int c=a-b;
		
		System.out.println("Substraction of two number is :"+c);
		System.out.println();
	}
	
	public static void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		
		System.out.println("Multiplication of two number is :"+c);
	}

}
