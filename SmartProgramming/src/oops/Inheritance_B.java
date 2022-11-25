package oops;

public class Inheritance_B  extends Inheritance_A{

	public void m3()
	{
		System.out.println("Method m3");
	}
	
	public static void main(String[] args) {
		
		Inheritance_A b=new Inheritance_A();
		b.m1();
		b.m2();
	}
}
