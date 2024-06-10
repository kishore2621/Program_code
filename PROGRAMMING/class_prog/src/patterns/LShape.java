package patterns;

public class LShape 
{
	 public static void print1(int row,int col)
	   {  
		   for(int i=1;i<=row;i++)
		   {
			   for(int j=1;j<=col;j++)
			   {
				   if(i==row||j==1)
				   {
				   System.out.print("*  ");
				   }
				   else
				   {
					   System.out.print("  ");
				   }
				  
			   }
			   System.out.println();
		   }
	   }
	 public static void print(int row,int col)
	   {  
		   for(int i=1;i<=row;i++)
		   {
			   for(int j=1;j<=col;j++)
			   {
				   if(i==1||j==col)
				   {
				   System.out.print("* ");
				   }
				   else
				   {
					   System.out.print("  ");
				   }
				  
			   }
			   System.out.println();
		   }
	   }
	   public static void main(String[] args) 
	{
		print(5, 5);
	}
}
