package arrayques;

public class MissinngElement 
{
	public static int checks(int[]num,int n)
	{
		int sum1=n*(n+1)/2; //O(1)---> SPACE
		int sum2=0;
		
		for(int i=0;i<=num.length-1;i++) //O(N)---->TIME 
		{
			sum2=sum2+num[i];
			
		}
		
		return sum1-sum2;
		
	}
//	public static int check(int[]num,int n)//Hashing --O(2N)-->O(N)-->OVERALL TIME
//	{
//		int []res= new int[ n+1];//O(N)---> SPACE COMPLEXCITY
//		for(int i=0;i<=num.length-1;i++)//O(N)--->TIME
//		{
//			res[num[i]]=1;
//		}
//		int i;
//		for( i=1;i<=res.length-1;i++)//O(N)---->TIME
//		{
//			if(res[i]==0) 
//			{
//				break;
//			}
//		}
//		
//		return i;
//		
//	}
	public static int check(int[]num,int n)
	{
		int sum1=0; //O(1)---> SPACE
		int sum2=0;
		
		for(int i=0;i<=num.length-1;i++) //O(N)---->TIME 
		{
			sum1=sum1^i+1;
			
				sum2=sum2^num[i];
			
			
		}
		sum1=sum1^n;
		
		return  sum1^sum2;
		
	}
	public static void main(String[] args) 
	{
		int []num= {1,2,5,4};
		int n=5;
		System.out.println(check(num,n));
	}
}
