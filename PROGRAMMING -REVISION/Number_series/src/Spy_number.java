
public class Spy_number 
{
	
	public static void main(String[] args) {
		
		int spy=1124;
		
		int sum=0;
		int product=1;
		
		while(spy>0)
		{
			sum=sum+(spy%10);
			product=product*(spy%10);
			
			spy=spy/10;
		}
		
		if(sum==product)
		{
			System.out.println("spy number");
		}
		else {
			System.out.println("not");
		}
	}

}
