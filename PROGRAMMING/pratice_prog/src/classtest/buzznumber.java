package classtest;

public class buzznumber {
	public static String find(int n) {
		if(n%7==0 || n%10==7) {
			return "buzz number";
		}
		else {
			return "not buzz number";
		}
	}
	public static void main(String[] args) {
		System.out.println(find(17));
		System.out.println(find(47));
		System.out.println(find(54));
	}
}
