package Basic;

// Find missing number in Array

public class MissingNumberArray {

	public static void main(String[] args) {
	
		int sum1=0;
		int sum2=0;
		
		int [] a= {11,12,13,15,16,17,18,19,20};
		
	for(int i=0; i<a.length; i++)
	{
		sum1 = sum1 + a[i];
	}	
	
	for(int i=11; i<=20; i++)
	{
		sum2 = sum2 + i;
	}
	System.out.println("Missing number is:"+(sum2-sum1));
	}
}
