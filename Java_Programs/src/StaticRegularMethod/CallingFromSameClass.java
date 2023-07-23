package StaticRegularMethod;

public class CallingFromSameClass {
	
	//Static Regular Method Calling From Same Class.
	
	public static void main(String[] args) 
	{
		
		System.out.println("Calling Method From Same Class");
		System.out.println();
		
		// 1. Direct Calling method Syntax = Methodname();
		       demo1();
		       demo2();
		       
	   // 2. Caling method by class name
		    // Syatax - classname.methodname();
		       
		       CallingFromSameClass.demo2();
		       
		       
	}
	  public static void demo1()
	     {
	    	 System.out.println("Static Regular Method Calling From Same Class - demo1");
	    	 System.out.println("Hello");
	    	 System.out.println();
	     }
	  
	  public static void demo2()
	     {
	    	 System.out.println("Static Regular Method Calling by Class name - demo2");
	    	 System.out.println("good Morning");
	    	 System.out.println("good Morning");
	    	 System.out.println("good Morning");
	    	 System.out.println();
	     }
}
