package Java_basic_pgm;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         String name="java code";
		
		String array[]=name.split(" ");
		
		for(int j=0;j<=1;j++)
		{
			char y[]=array[j].toCharArray();//this line give indexing from zero to last index to the characters of array
			
			  for(int i=y.length-1;i>=0;i--) 
			  {
				  System.out.print(y[i]); 
				 
				  }
			  System.out.print(" ");
		}

	}

}
