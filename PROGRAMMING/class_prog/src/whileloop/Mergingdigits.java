package whileloop;

public class Mergingdigits 
{
public static long merge(int n1,int n2) 
{
	int t=n2;
	int count=0;
	while(t>0) 
	{
	count++;
	t=t/10;
	}
	int n=(int)Math.pow(10, count);
	return n1*n+n2;
}
public static void main(String[] args) {
	System.out.println(merge(12,34));
}
}
