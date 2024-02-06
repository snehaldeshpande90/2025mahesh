package Java_basic_pgm;

public class pyramid_star_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=15;
		for(int i=1;i<=x;i++)//change line
		{
			
			  for(int j=14;j>=i;j--)//create space for every line to create middle star
				  {
			  
			  System.out.print(" ");//print()method for same line print not below
			  
			  }
			 
			for(int k=1;k<=i;k++)
			
			{
				System.out.print(" *");//print() for same line print not below
			}
			
			
			System.out.println();
		}

	}
}



