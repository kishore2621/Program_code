package org.jsp.QueuimplLikedlist;

public class User 

{
	
	public static String reverseWord(String str)
    {
       
        String res="";
        
        for(int i=str.length()-1;i>=0;i--)
        {
        	res=res+(str.charAt(i));
        }
        
        return res;
    }
	public static void main(String[] args) {
//		QueuimplLikedlist s1= new QueuimplLikedlist();
//		s1.add(10);
//		s1.add(20);
//		s1.add(30);
//		
//		System.out.println(s1.peak());
		
		
//		System.out.println(s1.size());
//		System.out.println(s1.isEmpty());
//		System.out.println(s1);
		
		System.out.println(reverseWord("hello"));
		
		

	}

}
