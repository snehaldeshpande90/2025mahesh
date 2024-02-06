package Java_basic_pgm;

public class PrintDuplicateCharValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="mahem";
		char c[]=name.toCharArray();
		for(int i=0;i<=name.length()-1;i++)
		{
			for(int j=i+1;j<=name.length()-1;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[j]);
				}
			}
				
				
				
				
				
				
				
		}
	}

}
