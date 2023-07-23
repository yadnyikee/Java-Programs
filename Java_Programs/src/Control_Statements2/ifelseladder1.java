package Control_Statements2;
public class ifelseladder1 
{
	public static void main(String[] args) 
	{
		int marks = 60;
	   
		if(marks>=65)         //50>=65 false
		{
			System.out.println("Distinction");
		}
		else if(marks>=60)     //50>=60 falses
		{
			System.out.println("First Class");
		}
		else if(marks>55)     //50>=55
		{
			System.out.println("Higher Second Class");
		}
		else if(marks>50)    //50>50 True
		{
		   System.out.println("Second class");	
		}
		else if(marks>35)
		{
			System.out.println("Pass"); //50>35 Trur
		}
		else
		{
			System.out.println("Failed");
		}
	}	
		
	
}
