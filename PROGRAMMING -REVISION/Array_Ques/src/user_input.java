import java.util.Scanner;

public class user_input 
{
	
	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of the array");
		int size= sc.nextInt();
		int arr []= new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the elements");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("output");
		
		int i=0;
		while(i<size)
		{
			System.out.print(arr[i]+" ");
			i++;
		}
		
		
 	}

}
