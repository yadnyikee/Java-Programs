package Forloop;

public class leapyear
{
	public static void main(String[] args) 
	{
	 /* Condition 	
	  * year%4==0
	  * year%400==0
	  * year%100!=0
	  * */
		
		int year = 2005;
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
	      System.out.println("Year is Leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}
	}
}
