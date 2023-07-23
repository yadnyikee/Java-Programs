package inheritance1;

public class test 
{
	public static void main(String[] args)
	{
		child c1 = new child();
		
		c1.home();
		c1.car();
		c1.money();
		c1.mobile();
		
		System.out.println();
		
		father f1 = new father();
		f1.home();
		f1.car();
		f1.money();
		
		System.out.println();
		
		whatsappv1 v1 = new whatsappv1();
		v1.textmsg();
		
		System.out.println();
		
		whatsappv2 v2 = new whatsappv2();
		v2.textmsg();
		v2.audiocall();
		
		System.out.println();
		
		whatsappv3 v3 = new whatsappv3();
		v3.textmsg();
		v3.audiocall();
		v3.videocall();
		
		System.out.println();
		
		whatsappv4 v4 = new whatsappv4();
		v4.textmsg();
		v4.audiocall();
		v4.videocall();
		v4.payment();
		
		System.out.println();
		
		Son1 s1 = new Son1();
		s1.car1();
		s1.home1();
		s1.money1();
		s1.mobile1();
		
		System.out.println();
		
		son2 s2 = new son2();
		s2.car1();
		s2.home1();
		s2.money1();
		s2.mobile2();
		
		System.out.println();
		
		son3 s3 = new son3();
		s3.car1();
		s3.home1();
		s3.money1();
		s3.mobile3();
	}
}
