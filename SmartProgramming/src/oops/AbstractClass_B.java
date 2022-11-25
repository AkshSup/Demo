package oops;

public class AbstractClass_B extends AbstractClass_A{

	void run()
	{
		System.out.println("This is AbstractClass_A");
	}
	
	public static void main(String[] args) {
		
		AbstractClass_B b = new AbstractClass_B();
		b.run();
	}
}
