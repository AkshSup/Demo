package Basic;

import java.util.Arrays;

public class ArraysEqualsORnot {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		
		int [] b= {1,2,3,4,5};
		
		boolean flag=Arrays.equals(a,b);
		
		if(flag == true)
		{
			System.out.println("Both Arrays Are Equals");
		}
		else
		{
			System.out.println("Both Arrays Are Not Equals");
		}
	}
}
