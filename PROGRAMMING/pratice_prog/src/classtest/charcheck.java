package classtest;

public class charcheck {
	public static String check(int n) {
		if(n>='a' && n<='b')
		{
			return "upper case";
		}
		else if(n>='A' && n<='B') 
		{
			return "lower case";
		}
		else if(n>='0'&& n<='9') 
		{
			return "numeric value";
		}
		else
		{
			return "specicaracter";
		}
	}

	public static void main(String[] args)
	{
		System.out.println(check('A'));
		System.out.println(check('a'));
		System.out.println(check('9'));
	}
}
