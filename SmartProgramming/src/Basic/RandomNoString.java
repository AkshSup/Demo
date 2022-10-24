package Basic;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNoString {

	public static void main(String[] args) {
		
		//Method 1= by Random Class
		//Random ran=new Random();
		//int a=ran.nextInt(100);		// 0 to 999
		//System.out.println(a);
		
		//double b=ran.nextDouble();	//0 to 1
		//System.out.println(b);
		
		
		//Method 2= By Math class
		//System.out.print(Math.random());  // 0 to 1
		
		
		//Method 3 = By Apache Common Lang
//		String c=RandomStringUtils.randomNumeric(4);   //(NO of Digits)
//		System.out.println(c);
		
		String d=RandomStringUtils.randomAlphabetic(6);
		String new_mail_id=d+"@gmail.com";
		
		System.out.println(new_mail_id);
	}
}
