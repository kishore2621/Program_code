package InterFace;

@FunctionalInterface
interface Functional {
	
	void text ();
	
	public static void print()
	{
		System.out.println("Static method");
	}
	
	public default void print1()
	{
		System.out.println("Non static method");
	}

}
