package Java_basic_pgm;

public class Remove_white_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	         
         
		String string = "Theb best of both worldsb";    
          
		
		//System.out.println(string.replaceAll("\\s+", ""));
		
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) 
        {    
            if(string.charAt(i) != ' ')  
            {
               char word= string.charAt(i);
               
               System.out.print(word); 
        }    
            
        //Displays the total number of characters present in the given string    
         
    }    


	}
}
