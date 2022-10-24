package Basic;

import java.util.Scanner;

public class CountNoOfCharInString {

	public static void main(String[] args) {
		
		System.out.println("Enter words:");
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
//		String name="Welcome To Java";
		int count=0;
		String name1=name.replaceAll("\\s","");
		
		int len=name1.length();
		
		for(int i=len-1; i>=0; i--)
		{
			name1.charAt(i);
				
			count++;
		}
		System.out.println("Total Characters in word are::"+count);
	}
}
