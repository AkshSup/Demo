package Basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
	System.out.println("Enter any number:");;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	//Method 1:By Algorithm
	
	/* int rev=0;
	
	while(num!=0)
	{
		rev=rev*10 + num%10;
		num=num/10;
	}
	System.out.println("Reverse number is:"+rev); */
	
	//Method 2: By StringBuffer method
	StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse();
	
	System.out.println("Reverse number is:"+rev);
	}
}
