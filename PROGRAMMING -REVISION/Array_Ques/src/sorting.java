import java.util.Iterator;

public class sorting 
{
	
	
	public static void ascending(int arr[] )
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	
	public static void descending(int arr[] )
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {4,2,5,1,7,3,8,6};
		
		ascending(arr);
		
	}
}
