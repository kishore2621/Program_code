package classtest;

public class Zero {
	
public static void trailzero(int a)
{
	int t=a;
	int c=0;
//	if(a>=5)
//	{
//		c++;
//	}
	while(a>=5)
	{
		
		t=t/5;
		c=c+t;
		a=a/5;
	}
	System.out.println(c);
//	for(int i=1;i<=c;i++)
//	{
//		System.out.println("0");
//	}
}
public static void main(String[] args) {
	
	
	trailzero(1000);
}
}
