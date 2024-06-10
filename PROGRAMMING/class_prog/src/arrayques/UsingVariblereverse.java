package arrayques;

public class UsingVariblereverse 
{
	public static int[] point(int[]num)
	{
     int m=num.length-1;
     int[]res=new int[num.length];
     int n=res.length-1;
     int j=0;
     for(int i=0;i<num.length;i++)
     {
    	 if(num[i]%2==0) {
    		 res[j]=num[i];
    		 j++;
    	 }
    	 if(num[m]%2==1) {
    		 res[n]=num[m];
    		 n--;
    	 }
    	 m--;
     }
     print(res);
	return res;
	}
	public static void print(int[]n)
	{
		for(int i=0;i<n.length;i++)
		{
			System.err.print(n[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int [ ]num= {1,2,3,4,5,6,7,8};
		point(num);
	}
}
