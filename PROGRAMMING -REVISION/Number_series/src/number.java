
public class number {
	public static int check(int n)
	{
		int res=0;
		
		while(n>0)
		{
			int rem=n%10;
			res= res+rem*rem;
			n= n/10;
		}
		return res;
		
	}
	public static int check2(int n)
	{
		
		while(n>9)
		{
			n=check(n);
		}
		return n;
	}
public static void main(String[] args) {
	int n= 89;
	
	System.out.println(check2(n)==1?"happy number":"not a happy number");
	
}
}
