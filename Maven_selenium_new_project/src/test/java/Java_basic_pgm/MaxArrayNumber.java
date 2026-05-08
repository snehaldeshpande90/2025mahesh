package Java_basic_pgm;

public class MaxArrayNumber {

	public static void main(String[] args) {
		

		int arr[]= {11,12,13,10,15,17};
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println(max);
}
}