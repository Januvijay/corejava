
public abstract class Abstraction1 {
int year=2009;
int age=20;
 public Abstraction1()
{
	System.out.println("constructor called");
	System.out.println("age="+this.age);
}
 public  Abstraction1(int age)
{
	 this.age=age;
	 System.out.println("age="+this.age);
	
}


public void abstraction()
{
	System.out.println("                     CIET 2009 BATCH                   ");
	System.out.println("Student Details");
}
public abstract void studentDetails();

 
}
