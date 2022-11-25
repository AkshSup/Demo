package Basic;

public class PrintPrimeNo {

	public static void main(String[] args) {
		
		// Program to print prime numbers between 1 to 100
		
		for(int i=1; i<=100; i++)
		{
		int count =0;	
			
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)     
					count++;
			}
			if(count==2)
				System.out.println(i);
		}
	}	
}
