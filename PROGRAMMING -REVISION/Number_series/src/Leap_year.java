
public class Leap_year 
{
	public static void check(int n)
	{
		
		if(n%100!=0 && n%4==0 || n%100==0 && n%400==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}

	public static void main(String[] args) {
		check(2200);
	}
}
