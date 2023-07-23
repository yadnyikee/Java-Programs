package interfaceprog;

public class Test
{
	public static void main(String[] args) 
	{
		calculatorsubclass cs = new calculatorsubclass(); // static/early/compile/
		
		cs.addition();
		cs.multiplication();
		cs.substraction();
		
		System.out.println();
		
		cs.log();
		cs.tan();
		
		System.out.println();
		
		calculator c2 = new calculatorsubclass(); // dynamic/late/run time.
		
		c2.addition();
		c2.multiplication();
		c2.substraction();
		
		System.out.println();
		
		casio c3 = new calculatorsubclass();
		{
			c3.log();
			c3.tan();
		}
	}
}
