package Basic;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfString {

	public static void main(String[] args) {
		
String name = "abc abcd abc xyz abcd abcc xyz xyza abcd";
		
		String [] a = name.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			String str = a[i];
			
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
			}
			else
			{
				map.put(str, 1);
			}
		}
		
		Set<String> all = map.keySet();
		
		for(String single : all)
		{
			System.out.println(single + ":"+ map.get(single));
		}
	}
}
