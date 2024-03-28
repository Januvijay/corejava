
public class janani extends Abstraction1
{
	public janani()
{


	super(15);
 
 System.out.println("year="+year);
 
    
}
	
 
public void studentDetails()
{
	System.out.println("studentName=JANANI");
	System.out.println("studentNumber=001");
	System.out.println("studentDepartment=CSE");
	System.out.println("studentPhoneNumber=7500058");
}
public static void main(String[] args) {
	janani s1=new janani();
	s1.abstraction();
	s1.studentDetails();
	
}
}
