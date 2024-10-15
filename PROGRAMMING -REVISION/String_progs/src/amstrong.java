
public class amstrong 
{
	public static void ams(String str) 
	{
		
	String res="";
	
	for(int i=0;i<str.length();i++)
	{
		res=str.charAt(i)+res;
	}
		System.out.println(res.equals(str)? "amstrong" : "not amstrong");
	}
	public static void main(String[] args) {
		
		ams("hello");
	}

}
