package classtest;

public class Specialchar { 
	public static String check (char n) {
		if(n>=65&& n<=90 ||n>='0'&&n<'9'||n>=97 && n<=122) 
		{

			return "not special character";
		}
		return "HELLO";
	}
	public static void main(String[] args) {
		System.out.println(check('!'));
		System.out.println(check('@'));
	}

}
