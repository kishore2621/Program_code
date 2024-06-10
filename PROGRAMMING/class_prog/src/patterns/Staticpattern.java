package patterns;

public class Staticpattern 
{
   public static void print(int row,int col)
   {  int n=1;
	   for(int i=1;i<=row;i++)
	   {
		   for(int j=1;j<=col;j++)
		   {
			   System.out.print(n+" ");
			   n++;
		   }
		   System.out.println();
	   }
   }
   public static void print1(int row,int col)
   {  
	   for(int i=1;i<=row;i++)
	   {
		   for(int j=1;j<=col;j++)
		   {
			   System.out.print("*  ");
			  
		   }
		   System.out.println();
	   }
   }
   public static void main(String[] args) {
	print1(3, 3);
}
}
