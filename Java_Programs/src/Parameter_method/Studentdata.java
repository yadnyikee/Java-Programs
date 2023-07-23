package Parameter_method;

public class Studentdata 
{
   public static void main(String[] args) 
   {
	 studname("Yadnyikee");
	 Studentdata.studname("Rashmi");
	 
	 Studentdata.studinfo("Riya", 10, 'A');
	// studinfo("Ram", 11, 'B');
	 
	 Studentdata.studinfo("Diya", 12, 'C');
	// studinfo("Ram", 11, 'B');
	
   }
   
   public static void studname(String name)
   {
	 System.out.println("Student Name is :"+name); 
	 System.out.println();
   }
   
   public static void studinfo(String name, int rollno, char grade)
   {
	   System.out.println("Student Name is :"+name);
	   System.out.println();
	   System.out.println("Student Roll no is :"+rollno);
	   System.out.println();
	   System.out.println("Student Grade is :"+grade);
	   System.out.println();
   }
}
