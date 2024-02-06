package Java_basic_pgm;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n3;int n1=0;int n2=1;
		
		for(int i=0;i<10;i++)
		{
			 n3=n1+n2;//swap value n1<--n2 and n2<--n3
			 n1=n2;
			 n2=n3;
			 System.out.println(n3);
			 System.out.println(n3);
			
		}
	}

}
