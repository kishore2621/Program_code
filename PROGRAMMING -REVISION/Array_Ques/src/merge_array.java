
public class merge_array 
{
	
	
	private static void merge(int n1[],int n2[]) 
	{
		
		int arr[]= new int [n1.length+n2.length];
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<n1.length)
			{
				arr[i]=n1[i];
			}
			if(i<n2.length)
			arr[n1.length+i]=n2[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int n1[] = {1,2,3,4,5};
		int n2 []= {6,7};
		
		merge(n1, n2);
		
	}

}
