package Java_basic_pgm;

public class Word_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="mahesh deshpande kini";
		
		      int count=1; //first word start from 1   
		{
			for(int i=0;i<name.length()-1;i++)
			{
				char c;
				c=name.charAt(i);//0-->m
				char d=name.charAt(i+1);//0+1=1-->a
				if(c==' ' && d!=' ')
				{
					count++;//1
				}
				
			}
				System.out.println(count);
		}
		
		
	}

}
