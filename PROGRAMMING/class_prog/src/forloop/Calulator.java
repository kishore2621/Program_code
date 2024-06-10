package forloop;

import java.util.Scanner;

public class Calulator {

public static int cal(int n)
{
 int sum=0;
for(int i=1;i<=n;i++)
{
  
  sum= sum+i;

}
return sum;

}
	
public static void main (String [] args)
{

Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
 System.out.println(cal(n));
sc.close();
}
}
