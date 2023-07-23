package Practice;

public class Nonbycls {
	
	public static void main(String[] args) 
	{
	  // First we have to create object to call nn static regular method
		
		Nonbycls obj =new Nonbycls();
		obj.N1();
		obj.N2();
	}
	
	public void N1()
	{
		System.out.println("Non Static Regular Method Calling By Class --> N1");
		System.out.println();
	}
	
	public void N2()
	{
		System.out.println("Non Static Regular Method Calling By Class --> N2");
		System.out.println();
	}

}
