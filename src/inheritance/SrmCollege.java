package inheritance;

public class SrmCollege extends AnnaUniversity

{
	public void collegeName()
	{
		System.out.println("             SRM UNIVERSITY        ");
		System.out.println("Admission starts at march 03 2024.");
	}
	
	public static void main(String[] args)

	{
		
		SrmCollege s1=new SrmCollege();
		s1.collegeName();
		 s1.notification();
		 s1.feesDetails();
		s1.feesDetails(3000);
		s1.feesDetails(3000, 1500);

	}	

}
