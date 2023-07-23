package Forloop;

public class forloop2 
{
	public static void main(String[] args)
	{
	// WAP to print 5 to 10 numbers using for loop
		// star cond = 5 and end cond = 20.
		/* 1.5<=20 true it will check upto 20<=20 all these conditions are ture
		 after that it will check for 21<=20 and this false cond at that loop will be executed*/
		
		for(int num=5;num<=20;num++)
		{
			System.out.println("Print Numbers :"+num);
		}
		System.out.println("Loop Executed");
	}
}
