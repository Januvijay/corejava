package inheritance;

public class AnnaUniversity {                   
	int fees=75000;
	//method over riding .attains in various class. 
	public void collegeName()
	{
		System.out.println("       AnnaUniversity              ");
		System.out.println("Admission starts at march 03 2024.");
	}
	
	public void notification()
	{
		System.out.println("Students want to pay their exam fees on or before march 3rd 2024");
		
	}
 public void feesDetails()
 {
	 System.out.println("TOTAL FEES="+fees+"ruppes.");
 }
 
 //polymorphism. method overloading attains in single class
 
 
 public void feesDetails( int a)
 {
	 fees=this.fees+a;
	 System.out.println("fees to be paid before 10 th march=" + fees+"rupees.");
 }
  public void feesDetails( int a,int b)
 {
	 fees=this.fees+a;
	int c=fees+a+b;
	 
	 System.out.println("fees to be paid after 10 th march=" + c+"rupees.");
 }
 

}
