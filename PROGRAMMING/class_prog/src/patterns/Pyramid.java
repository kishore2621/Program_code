package patterns;

public class Pyramid 
{
	public static void print(int row,int col)///LEFT
	   {  
		   for(int i=1;i<=row;i++)
		   {
			   for(int j=1;j<=col;j++)
			   {
				   if(i+j>= row+1)
				   {
				   System.out.print("* ");
				   }
				   else
				   {
					   System.out.print(" ");
				   }
				  
			   }
			   System.out.println();
		   }
	   }
	   public static void main(String[] args) 
		{
			print(3, 3);
		}

}
