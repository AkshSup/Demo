package Basic;

public class PalindromeString {

	public static void main(String[] args) {
		
		String name="MADAM";
		String rev="";
		int len=name.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev + name.charAt(i);
		}
		if(name.equals(rev))
		{
			System.out.println("String is Palindrome:"+rev);
		}
		else
		{
			System.out.println("String is not Palindrome:"+rev);
		}
	}
}
