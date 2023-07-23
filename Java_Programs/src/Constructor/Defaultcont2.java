package Constructor;
public class Defaultcont2 
{
	// Default contructor
	// public Defaultcontructor2()
	// {
	//   super();
	// }
	
//	Rules
//	1. It aalways no arguments/zero parameter constructor
//	2. Access modifiers of the default constructor is same as class modifier.
//	3. Default constructor contains on one line that is super(); class/keyword.
//	4. The default constructor is used to private the default values to the object
	
	public static void main(String[] args)
	{
	
		Defaultcont2 d1 = new Defaultcont2();
		Defaultcont2 d2 = new Defaultcont2();
		
		d1.m1();
		d2.m2();
		
		//System.out.println(d1.name);

	}
	
	public void m1()
	{
		System.out.println("Good Morning");
	}
	
	public void m2()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
	}

}
