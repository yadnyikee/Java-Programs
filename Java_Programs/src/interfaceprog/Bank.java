package interfaceprog;

public class Bank implements RBIBank,USBank,Brazilbank
{

	@Override
	public void homeloan() {
		System.out.println("Home Loan");
		
	}

	@Override
	public void bikeloan() {
		System.out.println("Bike Loan");
		
	}

	@Override
	public void mutualfunds() {
		System.out.println("Mutual Funda");
		
	}

	@Override
	public void carloan() {
		System.out.println("Car Loan");
		
	}

	@Override
	public void creditcard() {
		System.out.println("Credit card");
		
	}

	@Override
	public void debircard() {
		System.out.println("DEBIT CARD");
		
	}

	@Override
	public void trasnfermoney() {
		System.out.println("transfer money");
		
	}
	
	public void goldloan()
	{
		System.out.println("Gold Loan");
	}
	
	public static void main(String[] args) 
	{
		Bank b1 = new Bank();
		
		b1.creditcard();
		b1.debircard();
		b1.bikeloan();
		b1.carloan();
		b1.homeloan();
		b1.mutualfunds();
		b1.goldloan();
		System.out.println();
		RBIBank r1 = new Bank();
		r1.creditcard();
		r1.debircard();
		r1.trasnfermoney();
		System.out.println();
		USBank u1 = new Bank();
		u1.carloan();
		u1.mutualfunds();
		System.out.println();
		Brazilbank b11 = new Bank();
		b11.homeloan();
		b11.bikeloan();
	}

}
