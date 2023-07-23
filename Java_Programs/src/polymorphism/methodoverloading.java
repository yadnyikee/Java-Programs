package polymorphism;

public class methodoverloading 
{
	
	public static void main(String[] args) 
	{
		methodoverloading c1 = new methodoverloading();
		c1.m1();
		c1.m1(10);
		c1.m1(10,20);
		c1.m1("rashmi");
		
		methodoverloading.demo1();
	}
	public static void m1()
	{
		System.out.println("Zero parameter method");
	}
	
	public void m1(int i)
	{
		System.out.println("One parameter method");
	}
	
	public void m1(int i,int c)
	{
		System.out.println("Two parameter method");
	}
	
	public void m1(String name)
	{
		System.out.println("One parameter method");
	}
	
	public static void demo1()
	{
		System.out.println("Hello");
	}
}
