package Basic;

public class DuplicateElementsInStringArray {

	public static void main(String[] args) {
		
		String [] name= {"Welcome","Java","Hello","Ruby","Welcome","Java","Ruby"};
		
		for(int i=0; i<name.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(name[i].equals(name[j]))
				{
					System.out.println("Duplicate element is:" +name[i]);
				}
			}
		}
	}
}
