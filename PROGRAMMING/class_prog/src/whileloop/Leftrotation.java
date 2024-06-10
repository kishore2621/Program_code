package whileloop;
//Write rotate the given number to its left
public class Leftrotation 
{
		public static long rotate(int n) 
		{
			long n1=n/100;
			long n2=n%100;
			long t=n2;
			int res=1;
			while(t>0) 
			{
				res*=10;
				t=t/10;
			}
			return n2*res+n1;
		}
		public static long rotate1(long n) 
		{
			long t=n;
			long res=1;
			while(t>9) 
			{
				res=res*10;
				t=t/10;
			}
			long first = n/res;
			long last=n%res;
			return last*10+first;
		}
		public static void main(String[] args) {
			System.out.println(rotate(1234));
			System.out.println(rotate1(1234));
		}
}
