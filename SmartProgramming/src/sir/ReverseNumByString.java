package sir;

public class ReverseNumByString {

	public static void main(String[] args) {
		
		int num = 12457;
		
		String rev = "";
		
		String name = Integer.toString(num);
		
		int len = name.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + name.charAt(i);
		}
		
		System.out.println(Integer.parseInt(rev));
		
//		System.out.println(rev);
		
//		int rev=0;
//		
//		while(num!=0)
//		{
//			rev = rev*10 + num%10;
//			num = num/10;
//		}
//		
//		System.out.println(rev);
	}
}
