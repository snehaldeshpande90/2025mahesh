package Java_basic_pgm;



public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String reverse = ""; // Objects of String class  
	     String original="mime";
	     
	      int length = original.length();  
	      
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println(" is a palindrome.");  
	      else  
	         System.out.println("isn't a palindrome.");   
	}

}
