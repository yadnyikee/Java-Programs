package Arithmetic;

public class Logical 
{
	public static void main(String[] args) 
	{
	   boolean A = true;
	   boolean B = true;
	   
	   System.out.println(A&&B);  // in AND operator it will true if both the expression are true otherwise false
	   System.out.println(A||B);
	   System.out.println();
	   
	   boolean a1 = true;
	   boolean b2 = false;  // in OR operator it will true if either exp 1 or exp 2 is true
	   
	   System.out.println(a1&&b2);
	   System.out.println(a1||b2);
	   System.out.println();
	   
	   boolean a3 = false;
	   boolean b3 = true;
	   
	   System.out.println(a3&&b3);
	   System.out.println(a3||b3);
	   System.out.println();
	   
	   boolean a4 = false;
	   boolean b4 = false;
	   
	   System.out.println(a4&&b4);
	   System.out.println(a4||b4);
	   
	   
	 }
}
