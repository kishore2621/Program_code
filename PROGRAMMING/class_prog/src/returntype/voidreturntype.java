package returntype;

public class voidreturntype {
	public static void add(int a, int b) {
		int sum =a+b;
		System.out.println(sum);
		return;
	}
	public static void main(String[] args) {
		add(10,20);
		add(20,20);
	}
}
