package Basic;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfCharUsingHashMap {

	public static void main(String[] args) {
				
		String name = "Akshay Dadasaheb Deokar";

		String name1 = name.replaceAll("\\s", "");

		HashMap<Character, Integer> map = new HashMap<Character, Integer> ();

		for(int i=0; i<=name1.length()-1; i++)
		{
			char c = name1.charAt(i);
			
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}

		Set<Character> all = map.keySet();

		for(Character single : all)
		{
			System.out.println(single +":"+ map.get(single));
		}
	}
}
