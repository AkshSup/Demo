package Basic;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String name = "Welcome To Singapore";
		
		name = name.replaceAll("\\s", "");
		
		System.out.println(name);
		
	}
}
