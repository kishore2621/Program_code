
public class occurence_of_each_character {
	public static void main(String[] args) {
		String str="hellothffggrdfgdddf";
		char[] c= str.toCharArray();
		int count=1;
		 for(int i=0;i<str.length();i++)
		 {
			 for(int j=i+1;j<c.length;j++)
			 {
				 if(str.charAt(i)==c[j])
				 {
					 count++;
					 c[j]='0';
					 
				 }
				
				 
			 }
			 if(c[i]!='0')
			 System.out.println(str.charAt(i)+" "+count);
			 count=1;
		
		 }
	}

}
