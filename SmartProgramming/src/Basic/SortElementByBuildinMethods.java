package Basic;

import java.util.Arrays;
import java.util.Collections;

public class SortElementByBuildinMethods {

	public static void main(String[] args) {
		
//		int [] a = {10,5,6,9,8,1};
//		
//		//approach 1: by parallel sort method
//		System.out.println("Array Elements Before Sorting::"+Arrays.toString(a));;
//		Arrays.parallelSort(a);
//		System.out.println("Array Elements After Sorting::"+Arrays.toString(a));;
//		
//		//approach 2: by using sort method
//		System.out.println("Array Elements Before Sorting::"+Arrays.toString(a));;
//		Arrays.sort(a);
//		System.out.println("Array Elements After Sorting::"+Arrays.toString(a));;

		//sort elements in descending order
		Integer [] a = {10,23,37,44,50,69};	//int is primitive data type and collections class does not support to it so we have to change to derived data types.
		System.out.println("Array Elements Before Sorting::"+Arrays.toString(a));;
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array Elements After Sorting in descending order::"+Arrays.toString(a));;
	}
}
