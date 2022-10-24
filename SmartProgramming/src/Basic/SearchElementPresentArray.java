package Basic;

import java.util.Scanner;

public class SearchElementPresentArray {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50,80,90,12,56};
		
		System.out.print("Enter Search::");
		Scanner sc=new Scanner(System.in);
		
		int search=sc.nextInt();
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(search==a[i]) 
			{
				System.out.println("Element found at Position::"+(i+1));
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Search Not Found");
		}
	}
}
