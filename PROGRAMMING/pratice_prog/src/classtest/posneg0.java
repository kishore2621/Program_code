package classtest;

public class posneg0 {
	public static String checknumber(int a) {
		if(a>0){
			return"positive";
		}
		else if(a<0) {
			return"negative";
		}
		else {
			return "zero";
		}
	
		
	}
public static void main(String[] args) {
	System.out.println(checknumber(2));
	System.out.println(checknumber(-3));
}
}
