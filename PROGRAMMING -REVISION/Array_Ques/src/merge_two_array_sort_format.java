
public class merge_two_array_sort_format 
{
	
	public static void merge_sort(int n[], int n1[]) 
	{
		int arr[]= new int[n.length+n1.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<n.length)
			{
				arr[i]=n[i];
			}
			
			if(i<n1.length)
			
				arr[n.length+i]=n1[i];
			
		}
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					
					int temp=arr[i];
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
		
		int n [] = {1,2,7,10,5};
		int n1[]= {6,3,4,9,8};
		merge_sort(n, n1);
		
	}

}
