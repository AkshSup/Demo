package Basic;

import java.util.Scanner;

public class CountEvenOddDigitsofNumber {

	public static void main(String[] args) {
		
	System.out.print("Enter any number:");
	Scanner sc=new Scanner(System.in);
		
	int num=sc.nextInt();
	int even_count=0;
	int odd_count=0;
	
	while(num!=0)
	{
		int rem=num%10;
		
		if(rem%2==0)
		{
			even_count++;
		}
		else
		{
			odd_count++;
		}
		
		num=num/10;
	}
	System.out.println("Even numbers are:"+even_count);
	System.out.println("Odd numbers are:"+odd_count);
	}
}