
public class right_shift 
{
	
	public static void rightshift(int arr[],int rotate)
	{
		int count = rotate%arr.length;
		
		while(count!=0)
		{
		int first=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			
			arr[i]=arr[i-1];
			
		}
		arr[0]=first;
		count--;
		
		
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

	
	
	public static void main(String[] args) {
		 int[] num= {1,2,3,4,5,6};
		 rightshift(num,4);
	}
}
