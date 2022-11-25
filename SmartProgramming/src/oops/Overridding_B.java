package oops;

public class Overridding_B extends Overridding_A {

	public void display(String name)
	{
		System.out.println("This is Display Method of Overridding_B class");
	}
	
	public static void main(String[] args) {
		
		Overridding_B b = new Overridding_B();
		b.display("Akshay");
		
		Overridding_A a = new Overridding_A();
		a.display("Supriya");
	}
}
