package Basic;

import java.util.Scanner;

public class CountNoOfDigitsInNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter any number:" );
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits in number are:"+count);
	}
}
