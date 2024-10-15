package Number_programs;

public class Swap_without_thirdVariable 
{
	public static void Swap (int a,int b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println( a +" "+b);
	}
	
	public static void main(String[] args) {
		Swap(40, 20);
		

			
	}
}


