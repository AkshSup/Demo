package Basic;

import java.util.Scanner;

public class Validate_ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter a Number = ");
		
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int org_num = num;
		int rem, sum=0;
		
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			sum = sum + rem*rem*rem;
		}
		
		if(org_num == sum)
		{
			System.out.println("Its an armstrong number");
		}
		else
		{
			System.out.println("Its not an armstrong number");
		}
	}
}
