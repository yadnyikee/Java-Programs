package Array_Prog;

public class Array_7 
{
	public static void main(String[] args) 
	{
		// Multidimensional Array
		
		//String s1[] = new String[3];
		
		String s2[][] = new String[4][5];
		
		System.out.println(s2.length);  // rows
		
		System.out.println(s2[2].length);  // columns

		// initilization
		//Rows and columns
		
		// First Row
		
		s2[0][0] = "A1";
		s2[0][1] = "A2";
		s2[0][2] = "A3";
		s2[0][3] = "A4";
		s2[0][4] = "A5";
		
		System.out.println(s2[0][3]);
		System.out.println();
		
		s2[1][0] = "B1";
		s2[1][1] = "B2";
		s2[1][2] = "B3";
		s2[1][3] = "B4";
		s2[1][4] = "B5";
		
		s2[2][0] = "C1";
		s2[2][1] = "C2";
		s2[2][2] = "C3";
		s2[2][3] = "C4";
		s2[2][4] = "C5";
		
		s2[3][0] = "D1";
		s2[3][1] = "D2";
		s2[3][2] = "D3";
		s2[3][3] = "D4";
		s2[3][4] = "D5";
		
		for(int row=0; row<s2.length; row++)
		{
			for(int col=0; col<s2[2].length;col++)
			{
				System.out.print(s2[row][col]+ "");
				//System.out.print(s2[0][0]+ "");
			}
			System.out.println();
		}
		
		
		
		
	}
}
