package Basic;

public class CountNoOfEvenOddinArray {

	public static void main(String[] args) {
		
		int [] a = {8,1,4,3,6,7,9,2};

		int even=0;
		int odd=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				even++;
			}
		}

		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 != 0)
			{
				odd++;
			}
		}
		
		System.out.println("Even Count = "+even);
		System.out.println("Odd Count = "+odd);
	}
}
