package com.assigment;

public class Exam {
	public static void examhall(int noc, int noa) {
		
		double per = noa*noc/100;
		double all = 75/100*100;
		System.out.println("YOUR CLASS ATTENDANCE PERCANTAGE");
		if (per>=all) {
			System.out.println("YOU WILL ATTEND THE EXAM");
		}
		else {
			System.out.println("YOU WILL NOT ATTEND THE EXAM YOUR PERCANTAGE IS BELOW 75");
		}
	}
public static void main(String[] args) {
	examhall(100, 10);
}
}
