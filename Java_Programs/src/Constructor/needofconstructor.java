package Constructor;
public class needofconstructor 
{
	public needofconstructor()
	{
		System.out.println("Default Contructor");
	}
	
	
	String name;
	int rollno;
	
	public static void main(String[] args)
	{
		needofconstructor s1 = new needofconstructor();
		needofconstructor s2 = new needofconstructor();
		
		
		needofconstructor s100 = new needofconstructor();
		
		
	}
	
	public void m1()
	{
		System.out.println(name+""+rollno);
	}

}
