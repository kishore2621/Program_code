package patterns;

public class Diganoal {
	
	public static void print(int row,int col)///LEFT
	   {  
		   for(int i=1;i<=row;i++)
		   {
			   for(int j=1;j<=col;j++)
			   {
				   if(i==j)
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
	public static void print1(int row,int col)///RIGTH
	   {  
		   for(int i=1;i<=row;i++)
		   {
			   for(int j=1;j<=col;j++)
			   {
				   if(i+j==row+1)
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
	public static void print2(int row,int col)///X-DIAGONAL
	   {  
		   for(int i=1;i<=row;i++)//i+j>= row+1
		   {
			   for(int j=1;j<=col;j++)
			   {
				   if(i==j ||i+j==row+1)
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
		print2(5, 5);
	}

}
