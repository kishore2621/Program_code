package patterns;

public class Sample1 
{
	public static void print(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void print1(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=i;j<=r;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		print1(4, 4);
	}
}
