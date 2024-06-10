package classtest;

public class Uppercse {
	public static boolean casecheck(char n) {
		if (n>=65 && n<=90) {
			return true;

		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(casecheck('A'));
		System.out.println(casecheck('a'));
	}
}
