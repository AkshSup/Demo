package Basic;

import java.util.Arrays;

public class ArraysortingByBubbleSortMethod {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,-5,8,0,9};
		
		System.out.println("Array Before Sorting:"+Arrays.toString(a));
		
		int len=a.length;
		
//		for(int i=0; i<len-1; i++)
//		{
//			for(int j=0; j<len-1; j++)
//			{
//				if(a[j]>a[j+1])				//(symobol > ---> output ascending order)
//				{
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		System.out.println("Array After Sorting in Ascending order:"+Arrays.toString(a));
		
		
		//Descending order
		for(int i=0; i<len-1; i++)
		{
			for(int j=0; j<len-1; j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array After Sorting in Descending order:"+Arrays.toString(a));

	}
}
