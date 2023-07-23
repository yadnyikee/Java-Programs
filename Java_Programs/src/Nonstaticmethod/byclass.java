package Nonstaticmethod;

public class byclass {
	public static void main(String[] args) {
		
		// Calling non static method by same class 
		//For non static method we have to create object to call method.
		
		System.out.println("Non Static Regular Method Start");
		System.out.println();
		
		// To Declare Non Static Method we have create object.
		// We didn't declare direct methods in this.
		
	/*	m1();
		m2(); */
		
		//Symtax To declare Object.
		// Classname variable = new class name();
		
		byclass var = new byclass();
		
		
		// To declare object syntex is var.method();
		
		var.M1();
		var.M2();
		System.out.println("Non Static Regular Method End");
		System.out.println();
	}

	public void M1()
	{
		System.out.println("We didn't declare static keyword in This method thats why it is known as non static method");
		System.out.println();
	}
	
	public void M2()
	{
		System.out.println("We didn't declare static keyword in This method thats why it is known as non static method");
		System.out.println();
	}
}
