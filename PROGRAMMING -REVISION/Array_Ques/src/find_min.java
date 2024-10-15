
public class find_min 
{

	public static int min(int arr[]) 
	{
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max>arr[i])
			{
				max=arr[i];
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {10,40,5,80,120,30};
		
		System.out.println(min(arr));
		
	}

}
