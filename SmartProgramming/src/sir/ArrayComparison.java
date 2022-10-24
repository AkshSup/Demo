package sir;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		
		int [] b = {1,3,4,5};
		
		boolean flag = Arrays.equals(a, b);
		
		if(flag == true)
		{
			System.out.println("Arrays are Equals");
		}
		else
		{
			System.out.println("Arrays are not Equals");
		}
	}
}
