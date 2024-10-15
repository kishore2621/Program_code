
public class merge_arrays 
{
	public static void merge(int[]arr1,int[] arr2)
	{
		int[] newarr=new int[arr1.length+arr2.length];

		for(int i=0;i<newarr.length;i++)
		{
			if(i<arr1.length)
			{
				newarr[i]=arr1[i];
			}
			else
			{
				newarr[i]=arr2[i-arr1.length];
			}
		}
		for(int i=0;i<newarr.length;i++)
		{
			for(int j=i+1;j<newarr.length;j++)
			{
				if(newarr[i]>newarr[j])
				{
					int temp= newarr[i];
					newarr[i]=newarr[j];
					newarr[j]=temp;
				}
			}
		}
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]+" ");
		}

	}
	public static void main(String[] args) {
		int[] a= {1,2,6,8,10};
		int[] b= {3,4,6,7,9};
		merge(a,b);

	}



}
