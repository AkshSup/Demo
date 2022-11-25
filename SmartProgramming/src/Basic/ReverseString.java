package Basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter any word:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
	
		//Method 1: by suing for loop
		String rev="";
		
		int len=name.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse word:"+rev);
		
		// Method 2: by suing StringBuffer
		
		StringBuffer sb=new StringBuffer(name);
		StringBuffer rev1=sb.reverse();
		
		System.out.println("Reverse word:"+rev1);
	}
}
