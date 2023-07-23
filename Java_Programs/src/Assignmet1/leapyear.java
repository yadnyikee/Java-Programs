package Assignmet1;

public class leapyear
{
	public static void main(String[] args)
	{
		int year = 2023;
		
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}
		else if(year%100!=0)
		{
			System.out.println("Not a Leap Year");
		}
		else if(year%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Completed");
		}
	}
}
