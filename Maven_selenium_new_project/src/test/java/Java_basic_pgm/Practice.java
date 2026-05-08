package Java_basic_pgm;

import org.checkerframework.checker.units.qual.s;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = { 8,5,2,7,4,9};
        int largest =0;
        int secondLargest = 0;
        
        for(int i=0;i<=arr.length-1;i++)
        {
        	if(arr[i]>largest)
        	{
        		secondLargest=largest;
        		largest=arr[i];
        	}
        	else if(arr[i]>secondLargest)
        	{
        		arr[i]=secondLargest;
        	}
        }
        System.out.println();
		}
		       
	}  


