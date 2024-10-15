
public class occurence_of_each_character 

{
	
	
	public static void name(String str) 
	{
		int count=1;
		char[] res=str.toCharArray();
		for(int i=0;i<=res.length-1;i++)
		{
			for(int j=i+1;j<res.length;j++)
			{
				if(res[i]==res[j])
				{
					count++;
					res[j]='0';
					
				}
			}
			if(res[i]!='0')
			{
				System.out.println(res[i] +"="+count);
			}
			count=1;
		}
		
	}
	
	public static void main(String[] args) {
		name("hello");
	}

}
