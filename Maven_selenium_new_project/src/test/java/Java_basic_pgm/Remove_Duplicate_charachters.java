package Java_basic_pgm;

public class Remove_Duplicate_charachters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="mmahheesh";
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<=str.length()-1;i++)//i=0,1,2,3,4
		{
			char c=str.charAt(i);//i=0-->m
			
			int idx=str.indexOf(c, i+1);
			
			if(idx==-1)
			{
				sb.append(c);
			}
			
		}
   System.out.println(sb);
	}

}
