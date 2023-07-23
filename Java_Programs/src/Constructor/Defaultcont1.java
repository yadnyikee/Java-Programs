package Constructor;
public class Defaultcont1 

{
	String name = "rashmi";
	//int rollno;
	
	public Defaultcont1()
	{
		System.out.println("Default Constructor");
		//System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		Defaultcont1 d1 = new Defaultcont1();
		Defaultcont1 d2 = new Defaultcont1();
		Defaultcont1 d3 = new Defaultcont1();
		
		System.out.println(d1.name);
		d1.m1();
	}
	
	public void m1()
	{
		System.out.println("Default Method");
	}
}
