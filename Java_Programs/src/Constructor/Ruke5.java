package Constructor;
public class Ruke5
{
	public static void main(String[] args) 
	{
		// Any no of constructor can be declared in java class but constructor should be same as class name but should hav diff parameter of argument.
		
		Ruke5 r1 = new Ruke5();
		Ruke5 r2 = new Ruke5(3);
		Ruke5 r3 = new Ruke5(1,2);
		Ruke5 r4 = new Ruke5(1,2,3);
		
	
	}
	
	public Ruke5()
	{
		System.out.println("Zero input parameter");
	}
	
	public Ruke5(int i)
	{
		System.out.println("One input parameter");
	}
	
	public Ruke5(int a,int b)
	{
		System.out.println("Two input parameter");
	}
	
	public Ruke5(int a , int b,int c)
	{
		System.out.println("Three input parameter");
	}

}
