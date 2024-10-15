
public class left_shift 
{
	public  static void   rotate( int arr[],int rot) 
	{
		int rotate=rot%arr.length;
		
		
		
		while(rotate!=0)
		{
			int last=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=last;
			rotate--;
			
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
	}
	
	public static void main(String[] args) 
	{
		 int[] num= {1,2,3,4,5,6};
		 rotate(num,8);
		
	}

}
