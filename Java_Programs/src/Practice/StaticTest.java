package Practice;

public class StaticTest 
{
     public static void main(String[] args)
     
     {
		//By Class name Calling
    	 
    	 StaticTest.T1();
    	 StaticTest.T2();
    	 StaticTest.T3();
    	 
    	 //Direct Calling
    	 
    	 T1();
    	 T2();
    	 T3();
    	 
    	 
    	 
    	 
	 }
     
     public static void T1()
     {
    	 System.out.println(" Static Regular Method by calling same class --> T1 ");
    	 System.out.println();
     }
     
     public static void T2()
     {
    	 System.out.println(" Static Regular Method by calling same class --> T2");
    	 System.out.println();
     }
     
     public static void T3()
     {
    	 System.out.println(" Static Regular Method by calling same class --> T3");
    	 System.out.println();
     }
}
