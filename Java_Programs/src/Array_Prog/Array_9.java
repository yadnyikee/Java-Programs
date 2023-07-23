package Array_Prog;

public class Array_9
{
	public static void main(String[] args) 
	{
		//int arr[] = {2,3,4}; //3
		
		int number [][]= {{2,3,4}, {4,6,4}, {4,7,2}, {7,4,6}};
		
//		0 1 2
//	0	2 3 4
//	1	4 6 4 
//	2	4 7 2
//	3	7 4 6
		
		System.out.println(number.length); //row
		System.out.println(number[0].length); //col
		System.out.println();
		
		System.out.println(number[2][1]); //7
		
		System.out.println();
		
		System.out.println(number[3][2]); //4
		System.out.println();
//		for(int i=0; i<number.length;i++)
//		{
//			for(int j=0;j<number[0].length;j++)
//			{
//				System.out.print(number[i][j]);
//			}
//			System.out.println();
//		}
	}
}
