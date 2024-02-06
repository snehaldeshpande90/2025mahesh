package Java_basic_pgm;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java code 
		String name="bharat";//java code
		
		char array[]=name.toCharArray();//Converts this string to a new character array.
		
		  for(int i=array.length;i>=0;i--) //6
		  { 
			  System.out.print(array[i]); 
			  }
		 

		
		/*second approch
		 * for(int i=name.length()-1;i>=0;i--) { System.out.print(array[i]); }
		 */
		
		//third approch
		//StringBuffer bf=new StringBuffer(name);
		//System.out.println(bf.reverse());
	}

}
