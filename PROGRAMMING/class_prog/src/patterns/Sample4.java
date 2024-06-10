package patterns;

public class Sample4 
{
	public static void print1(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
	}
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=r;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		print1(5, 5);
	}

}
