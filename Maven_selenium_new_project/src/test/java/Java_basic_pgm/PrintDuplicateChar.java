package Java_basic_pgm;

public class PrintDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= new String("aabkkc");    
        int Count=0;   
            
        //Converts given string into character array    
        char str[] = str1.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i<str.length; i++) 
        {    
              
            for(int j = i+1; j <str.length; j++)
{    
                if(str[i] == str[j] ) 
                {    
                      System.out.println(str[j]);
                    Count++;
                }    
            }  
            
            
          
        }    
	        System.out.println(Count);
	}
}
