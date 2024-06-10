package InterFace;

public class Impfun implements Functional
{
	@Override
	public void text() {
		System.out.println("Override method");
		
	}
	public static void main(String[] args) 
	{
		Impfun f1= new Impfun();
		f1.text();
		f1.print1();
		Functional.print();
		
	}

	

}
