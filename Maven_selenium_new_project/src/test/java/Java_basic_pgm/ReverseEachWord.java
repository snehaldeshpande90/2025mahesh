package Java_basic_pgm;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="mera bharat mahan";
		 String s[]=name.split(" ");
		 String ans=" ";
		 String  k=" ";
		
		 for(int i=s.length-1;i>=0;i--)
		 {
			ans=ans+s[i]+" ";//arr[0]=mera
			 
			 for(int j=ans.length()-1;j>=0;j--)//mera 
			 {
				k=k+ans.charAt(j);
				
		 }
			 
	}
		 System.out.println(k);	
	}
}
