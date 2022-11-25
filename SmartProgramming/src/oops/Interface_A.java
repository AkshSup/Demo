package oops;

interface Alpha
{
	public abstract void test1();
	
	public abstract void test2();
	
	public abstract void test3();
}

public class Interface_A  implements Alpha{
	
	public void test1()
	{
		System.out.println("This is abstract method test1");
	}
	
	public void test2()
	{
		System.out.println("This is abstract method test2");
	}
	
	public void test3()
	{
		System.out.println("This is abstract method test3");
	}

	public static void main(String[] args) {
		
		Interface_A a = new Interface_A();
		
		a.test1();
		a.test2();
		a.test3();
	}
}
