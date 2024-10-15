
public class min_element 
{
	public static void main(String[] args) {
		int []arr= {1,3,4,10,6,7,8,9};
		int temp=arr[0];
		int first=0;
		for(int i=1;i<arr.length;i++)
		{
			if(temp>arr[i])
			{
				temp=arr[i];
				first=i;
			}
			           
			
		}
		int second=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]<arr[i+1] && arr[i]>arr[first])
			{
				
	              second=arr[i+1];  
				
			}
		}
		System.out.println(temp);
		System.out.println(second);
	}

	
}
