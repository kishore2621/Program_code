
public class linear_search 
{
	public static int search(int arr[], int key) 
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return 1;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) 
	{
		int arr []= {10,20,40,60,30};
		
		System.out.println(search(arr, 80)==1 ? "key is present": " key is not persent");
		
		
		
	}

}
