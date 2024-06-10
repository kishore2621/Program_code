package whileloop;

public class Rotationdigits 
{
   public static long rotate(int n) 
   {
	   int n1=n/10;
	   int n2=n%10;
	   int t=n1;
	   int res=1;
	   while(t>0) 
	   {
		   res=res*10;
		   t=t/10;
	   }
	   return n2*res+n1;
   }
   // user given how many rotation
   public static long rotate1(int n ,int t2) 
   {  int e=n;
	   int cout1=0;
	   while(e>0) 
	   {
		   cout1++;
		   e=e/10;
	   }
	   if(t2>cout1) 
	   {
		   t2=t2-cout1;
	   }
	   int res=1;
	   while(t2>0) 
	   {
		   res=res*10;
		   t2--;
	   }
	   int n1=n/res;
	   int n2=n%res;
	   int t= n1 ;
	   int count=1;
	   
	   while(t>0) 
	   {
		   count=count*10;
		   t=t/10;
	   }
	   
	   return n2*count+n1;
   }
   public static void main(String[] args) {
	System.out.println(rotate(17));
	System.out.println(rotate1(1234,6));
}
}
