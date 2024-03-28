package Polymorphism;

public class addition1 extends addition {
	public void add(int a, int b)// method overriding.

	{

		a = +a - b;
		System.out.println(a);
		System.out.println("method is over ridden");
	}

	public static void main(String[] args) {

		addition1 b1 = new addition1();
		b1.add(3, 05);
		b1.add(2, 5, 8);
	}
}
