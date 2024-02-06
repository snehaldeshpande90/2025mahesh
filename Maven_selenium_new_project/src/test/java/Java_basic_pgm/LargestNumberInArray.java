package Java_basic_pgm;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {11,12,13,10,15,17};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)//15>15
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
