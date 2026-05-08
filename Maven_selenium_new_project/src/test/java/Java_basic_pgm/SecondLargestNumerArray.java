package Java_basic_pgm;

public class SecondLargestNumerArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
        int largest =0;
        int secondLargest = 0;
        
       
        for (int i = 0; i < arr.length; i++)
        {
        	
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            
             else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
    }
	}


