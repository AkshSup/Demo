package Basic;

public class Print_vowels_ConsonentsfromString {

	public static void main(String[] args) {
		
		String name = "Akshay Dadasaheb Deokar";
		
		System.out.println("Vowels::");
		for(int i=0; i<name.length(); i++)
		{
			char c=(name.charAt(i));
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{
				System.out.println(name.charAt(i));
			}	
		}
		
		System.out.println("Consonents::");
		for(int i=0; i<name.length(); i++)
		{
			char c=(name.charAt(i));
			
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U')
			{
				System.out.println(name.charAt(i));
			}
		}	
	}
}
