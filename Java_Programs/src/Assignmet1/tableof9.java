package Assignmet1;

public class tableof9 
{ 
	//Print Table of 9
	// 9*1=9  1<=10 true
	// 9*2=18 2<=10 true
	// 9*3=27 3<=10 true
	//
	//
	// 9x10=90 10<=10 true
	// 9*11=99 11<=10 false
	
	public static void main(String[] args)
	{
		int mul = 9;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(mul*i);
		}
	}
}
