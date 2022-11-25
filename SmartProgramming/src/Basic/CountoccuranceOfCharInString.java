package Basic;

public class CountoccuranceOfCharInString {

	public static void main(String[] args) {
		
		String name = "akshay";	//case sensitivity is applicable
		
		int total=name.length();
		
		int later= name.replace("a","").length();
		
		System.out.println("Occurance of Character is"+" "+(total-later)+" "+"times");
		
	}
}
