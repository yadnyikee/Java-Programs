package interfaceprog;

public class calculatorsubclass implements calculator,casio
{

	@Override
	public void log() {
		System.out.println("Log method");
		
	}

	@Override
	public void tan() {
		System.out.println("Tan method");
		
	}

	@Override
	public void addition() {
		System.out.println("addition method");
		
	}

	@Override
	public void substraction() {
		System.out.println("substraction method");
		
	}

	@Override
	public void multiplication() {
		System.out.println("multiplication method");
		
	}
	
	public void sin()
	{
		System.out.println("sin method");
	}

}
