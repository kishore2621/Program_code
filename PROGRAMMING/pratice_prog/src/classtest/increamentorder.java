package classtest;

public class increamentorder {
	public static void inc(int a,int b,int c) {
		int max=max(a,b,c);
		int min =min(a,b,c);
		int tot = a+b+c;
		int med = tot-max-min;
		System.out.println("a="+min +" "+"b="+med+" "+"c="+max);
	}
	public static int max(int a,int b,int c) {
		if(a>b && a>c) {
			int max=a;
			return max;
		}
		else if (b>a && b>c) {
			int max=b;
			return max;
		}
		else {
			int max=c;
			return max;
		}

	}
	public static int min(int a, int b, int c) {
		if(a<b && a<c) {
			int min=a;
			return min;
		}
		else if (b<a && b<c) {
			int min=b;
			return min;
		}
		else {
			int min=c;
			return min;
		}

	} 
	public static void main(String[] args) {
		inc(40,20, 250);
		inc(30, 40, 10);
	}

	}


