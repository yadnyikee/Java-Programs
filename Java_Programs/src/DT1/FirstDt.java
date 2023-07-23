package DT1;

public class FirstDt {
	
  public static void main(String[]args)
  {
	  // Primitive Data Types
	  
	  //1. byte -- 1 byte --> 8 bit --> -128 to 127
	  
      /* Variable Declaration rule :
          Not Allowed white space.
          Not Begin with digit.
          Should not be a keyword. 
       */
	  //Byte data type should not allowed less than greater values than -128 to 127.
	  byte b = -128;
	  byte c = 127;
	  
	  System.out.println("Byte Data Type Min Number is : "+ b);
	  System.out.println("Byte Data Type Max Number is :"+ c);
	  System.out.println();  // To Print the space between lines.
	  
	  byte a = -50;
	  byte d = 100;
	  //Byte e = 150; is not allowed because of memory space.
	  
	  System.out.println("Byte Data Type is : "+ a);
	  System.out.println("Byte Data Type is : "+ d);
	  System.out.println();
	  
	  //2. Short Data Type 2 byte - 16 bit --> (-32768 to 32767)
	  
	  short a1 = -32768;
	  short a2 = 32767;
	 // short a3 = 32769; // Max values allowed in shot data type
	  // short a4 = 32768; not allowed of memory space
	  
	  System.out.println("Short Data Type Min Value is :"+ a1);
	  System.out.println("Short Data Type Max Value is :"+ a2);
	  System.out.println();
	  
	  //3. int data type 4 byte --> 32bit --> -2147483648 to 2147483647
	  
	  int b1 = -2147483648;
	  int b2 =  2147483647;
	  
	  // Int b3 = 2147483649; Not allowed because of memory space.
	  
	  System.out.println("Int data type Min Value is :"+b1);
	  System.out.println("Int data type Max value is :"+b2);
	  System.out.println();
	  
	  // Long Data type 8byte - - > 64 bit - - > -922337203368547758081 to 92233720368547758071
	  
	  long l1 = 2147483647;
	  long l2 = 922337;
	  
	  System.out.println("Long Data Type :"+l1);
	  System.out.println("Long Data Type :"+l2);
	  System.out.println();
	  
	  long l3 = -2147483647;
	 // long l4 = -922337203368547758081;
	  
	  System.out.println("Long Data Type :"+l3);
	  //System.out.println("Long Data Type :"+l4);
	  
	  
	  
	  
  }

}
