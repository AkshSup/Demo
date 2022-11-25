package oops;

public class Overloading {

	public void m1(int a)
	{
		System.out.println(a);
	}
	
	public void m1(String name)
	{
		System.out.println(name);
	}
	
	public void m1(double h)
	{
		System.out.println(h);
	}
	
	public void m1(String model, int b)
	{
		System.out.println(b +"_"+ model);
	}
	
	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		o.m1("Akshay");
		o.m1(20);
		o.m1(10.20);
		o.m1("Boeing", 20);
	}
}
