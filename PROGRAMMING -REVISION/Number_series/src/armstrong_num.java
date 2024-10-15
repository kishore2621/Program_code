
public class armstrong_num 
{
	
	public static void main(String[] args) 
	{
		int arm=153;
		int temp=arm;
		int sum=0;
		int power=0;
		while(temp>0)
		{
			power++;
			temp=temp/10;
			
		}
		temp=arm;
		while(temp>0)
		{
			int rem=temp%10;
			int q=1;
			for(int i=1;i<=power;i++)
			{
				q=q*rem;	
			}
			sum=sum+q;
			temp=temp/10;
		}
		System.out.println(sum);
		if(arm==sum)
		{
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not a amstrong number");
		}
	}

}
