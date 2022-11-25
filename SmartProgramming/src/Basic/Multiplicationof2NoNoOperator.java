package Basic;

import java.util.Scanner;

public class Multiplicationof2NoNoOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First Number = ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number = ");
		int b = sc.nextInt();
				
		int sum=0;
		
		for(int i=1; i<=b; i++)
		{
			sum = sum + a;
		}
		
		System.out.println("Multiplication of Two Numbers = "+sum);	
	}
}
