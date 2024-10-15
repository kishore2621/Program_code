
public class max_element 
{
	public static void main(String[] args) {
		int []arr= {1,3,4,10,6,7,8,9};
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(temp<arr[i])
			{
				temp=arr[i];
			}
		}
		int second=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1] && arr[i]<temp)
			{
	
                  second=arr[i+1];  
				
			}
		}
		System.out.println(temp);
		System.out.println(second);
	}

}
