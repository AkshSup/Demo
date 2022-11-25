package Basic;

import java.util.Scanner;

public class SumofDigitsinNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter any number:" );
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int sum=0;
		
		while(num!=0)
		{
			sum=sum + num%10;
			num=num/10;
		}
		System.out.println("Sum of Digits in Number is:"+sum);
	}
}
