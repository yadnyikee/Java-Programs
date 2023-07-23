package Constructor;

public class constuctorini 

{
		String name;
		String model;
		String engine;
		int Price;
		
		public constuctorini(String name1,String model1,String engine1,int price1)
		{
			name = name1;
			model = model1;
			engine = engine1;
			Price = price1;
			
			
		}
		
		public static void main(String[] args)
		{
			constuctorini c1 = new constuctorini("maruti","800","auto",800000);
			constuctorini c2 = new constuctorini("alto","800","manual",80655);
			
			System.out.println(c1.name+" "+c1.model+" "+c1.engine+" "+c1.Price+" ");
		}
}

