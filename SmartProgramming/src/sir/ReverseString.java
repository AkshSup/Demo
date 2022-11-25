package sir;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.print("Enter any Word::");
		
		Scanner sc=new Scanner(System.in);
		
		String name = sc.nextLine();  //sc.next()
		
		String rev = "";
		
		int len = name.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + name.charAt(i);
		}
		
//		System.out.println("Original Word::"+name);
		
		System.out.println("Reverse Word::"+rev);
		
		
	}
}
