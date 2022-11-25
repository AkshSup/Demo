package Basic;

public class JunkRemovee {

	public static void main(String[] args) {
		
		String s="$#%#&* Welcome &**&&* To 汉语中文 Selenium";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}
}
