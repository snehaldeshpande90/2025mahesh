package Java_basic_pgm;

public class DeleteArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int a[]= {1,2,3,4};
		
		
		/*
		 * int arr[]= {11,12,13,10,15,17};
		 * 
		 * 
		 * for(int i=1;i<arr.length;i++) { if(arr[i]==13) { continue; } else {
		 * System.out.println(arr[i]); } }
		 */

		//============================second mehode==================================
		
		int [] arr= {1,2,3,4,5,6};
		int[] newarr=new int[arr.length-1];//empty
		int removeElement=3;
		int index=0;
		
		//int a=4;
		//int c=a;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=removeElement)//1 ==3
			{
				newarr[index]=arr[i];//5 element
				
				index++;
				System.out.println(newarr[index-1]);
			}
			
		}
		
		
		
	}
}
