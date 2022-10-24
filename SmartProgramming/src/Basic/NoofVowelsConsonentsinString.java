package Basic;

public class NoofVowelsConsonentsinString {

	public static void main(String[] args) {
		
String name = "Welcome";
		
		int count_vowels = 0;
		int count_consonents=0;
		
		for(int i=0; i<name.length(); i++)
		{
			char c=(name.charAt(i));
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{
				
				count_vowels++;
			}	
			else
			{
				count_consonents++;
			}
		}
		System.out.println("NO of Vowels::"+count_vowels);
		
		System.out.println("NO of COnsonents::"+count_consonents);
	}
}
