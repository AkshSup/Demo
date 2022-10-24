package sir;

public class CountWhiteSpaces {
	
	public static void main(String[] args) {
		
		String name = "Akshay Dadasaheb Deokar";
		
		int len = name.length();
		
		String name1 = name.replaceAll("\\s", "");
		
		int len1 = name1.length();
		
		System.out.println("No of White Spaces::"+(len-len1));
	}
}
