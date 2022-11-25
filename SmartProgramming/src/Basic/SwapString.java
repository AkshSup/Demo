package Basic;

public class SwapString {

	public static void main(String[] args) {
		
	String 	a= "Selenium";
	String 	b= "Java";	
		
	System.out.println("Before Swapping::");
	System.out.println("Value of a="+a);
	System.out.println("Value of b="+b);
	
		//approach1 = using third variable
	
	/*String c;
	
		c=a;
		a=b;
		b=c;
	
	System.out.println("========================");
	System.out.println("After Swapping::");
	System.out.println("Value of a="+a);
	System.out.println("Value of b="+b);	*/
	
	//approach2 = by using substring method
	
	a=a+b;	//a=SeleniumJava
	
	b=a.substring(0, a.length()-b.length());
	
	a=a.substring(b.length());
	
	System.out.println("========================");
	System.out.println("After Swapping::");
	System.out.println("Value of a="+a);
	System.out.println("Value of b="+b);
	}
	
}
