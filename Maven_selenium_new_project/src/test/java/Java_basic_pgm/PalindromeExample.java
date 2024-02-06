package Java_basic_pgm;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=123;
		 int temp=n;
		 int r;
		 int sum=0;
		 while(n>0)
		 {
			 r=n%10;//
			 System.out.println(r);
			 sum=(sum*10)+r;
			 n=n/10;
			 
			 //System.out.println("reverse number also print"+sum);
		 }
		 if(temp==sum)
		 {
			 //System.out.println("Palindrome");
		 }
		 else
		 {
			 //System.out.println("notPalindrome");
		 }
		
	}

}
