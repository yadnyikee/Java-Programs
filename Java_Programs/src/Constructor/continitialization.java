package Constructor;
public class continitialization
{
	
		String name;
		String model;
		String engine;
		int Price;
		
		public continitialization(String name1,String model1,String engine1,int price1)
		{
			name = name1;
			model = model1;
			engine = engine1;
			Price = price1;
		}
		
		public static void main(String[] args)
		{
			continitialization c1 = new continitialization("maruti","800","automation",1000000);
			continitialization c2 = new continitialization("kia", "900", "Manual", 2000000000);
		}
}
