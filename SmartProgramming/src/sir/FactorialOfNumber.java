package sir;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number = ");
		
		int num = sc.nextInt();
				
		int a = 1;
		
		for(int i=1; i<=num; i++)
		{
			a = a * i;
		}
		System.out.println("Factorial Of"+" "+ num +" "+"is ="+a);
	}
}
