
public class lucky_number 
{
	public static void lucky() 
	{
		
		int count=1;
		
		
		while(count<=7)
		{
		for(int i=1; ;i++)
		{
		if(count==1 && i%2!=0 ||count==2 && i%3!=0  ||count==3 && i%4!=0  ||count==4 && i%5!=0  ||count==6 && i%7!=0  ||count==7 && i%8!=0 )
		{
			
			
		}
		else
		{
		System.out.print(i+" ");
		}
		count++;
		}
		}
	}
	
	public static void main(String[] args) {
		lucky();
	}

}
