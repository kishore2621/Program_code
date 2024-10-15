
public class reverse 
{
	public static void reverse(String str, int rotate) 
	{
		
		int count = rotate% str.length();
		String res="";
		String add="";
		
		for(int i=0;i<rotate;i++)
		{
			res= str.charAt(i)+ res;  
		}
		
	}

}
