package Java_basic_pgm;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "The best of both worlds";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) 
        {    
           if(string.charAt(i)!=' ')
           {
        	   count=count+1;
           }
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
    }    
}

