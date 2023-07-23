package upcastinganddowncasting1;

public class casting4 extends casting3

{
	public void demo3()
	{
		System.out.println("Method 3rd");
	}
	
	public static void main(String[] args)
	{
		casting4 c4 = new casting4(); // statc dynamic CTP runtime
		c4.demo1();
		c4.demo2();
		c4.demo3();
		
		System.out.println();
		
		//Upcasting
		casting3 c3 = new casting4();
		c3.demo1();
		c3.demo2();
		
		//Down Casting
		
		casting4 c2 = (casting4) new casting3();
		c2.demo1();
		c2.demo2();
		c2.demo3();
		
	}
}
