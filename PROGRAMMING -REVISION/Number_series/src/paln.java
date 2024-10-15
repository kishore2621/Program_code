
public class paln 
{
	public static void main(String[] args) 
	{
		
		int in=131;
		
		int temp=in;
		int pal=0;
		while(temp>0)
		{
			int rem=temp%10;
			pal=pal*10+rem;
			temp=temp/10;
		}
		
		if(in==pal)
		{
			System.out.println("polyndrome");
		}
		else {
			System.out.println("not a polyndrome");
		}
		
	}

}
