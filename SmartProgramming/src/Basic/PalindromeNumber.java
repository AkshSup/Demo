package Basic;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=12345;
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println("Number is Palindrome Number:"+org_num);
		}
		else
		{
			System.out.println("Number is not Palindrome Number:"+org_num);
		}
	}
}
