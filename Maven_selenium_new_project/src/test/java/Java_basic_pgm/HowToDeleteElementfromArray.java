package Java_basic_pgm;

public class HowToDeleteElementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int arr[]= {1,2,3,4,5};//arr size is 5
		
		
		int removeElement=2;
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=removeElement)
			{
				
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
