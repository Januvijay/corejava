package Polymorphism;

public class addition {
//method overloading.
	
	public void add(int a,int b)
	{
		a=a+b;
		System.out.println(a);
	}
	
	public void add(int a,int b,int c)
	{
		c=a+b+c;
		System.out.println(c);
	}

	public static void main(String[] args) {

		addition a1 = new addition();
		a1.add(3, 05);
		a1.add(2, 5, 8);
	}
	
}
