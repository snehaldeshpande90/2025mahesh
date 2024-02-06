package Java_basic_pgm;

import java.util.Arrays;

public class RemoveArrayElemenet2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int removeelement=3;
		int arr[]= {1,2,3,4,5};
		
	int newarr1[] =remove(arr, removeelement);
		System.out.println(Arrays.toString(newarr1));
	}
	
	
	
	public static int[] remove(int arr[],int removeElement)
	{
		int index=0;
		int[] newarr=new int[arr.length-1];//empty
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=removeElement)//1 ==3
			{
				newarr[index]=arr[i];//5 element
				
				index++;
			
			}
			
		}
		
		return newarr;
		
		
	}
	{
		
	}

}
