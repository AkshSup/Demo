package Basic;

import java.util.Scanner;

public class LargestofThree {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:" );
		int a=sc.nextInt();
		
		System.out.print("Enter second number:" );
		int b=sc.nextInt();
		
		System.out.print("Enter third number:" );
		int c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("First number is greater:"+a);
			}
			else
			{
				System.out.println("Third number is greater:"+c);
			}
		}
		else
			{
			if(b>c)
			{
				System.out.println("Second number is greater"+b);
			}
			else
			{
				System.out.println("Third number is greater:"+c);
			}
		}
	}
}
