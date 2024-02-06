package Java_basic_pgm;

public class Ulta_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=14;i++)
		{
			for(int j=1;j<=i;j++)//2
			{
				System.out.print(" ");//samora samor print karnysathi
			}
			
			for(int k=14;k>=(i*2);k--)//odd star
			{
				System.out.print("*");//samora samor print karnysathi
			}
		
			//for next line
			System.out.println();//eka khali ek yenysathi
		}

	}

}
