package inheritance;


public class VelsTech extends AnnaUniversity

{
	String collegeName="VelsTech";
	
	public void addmission()
	{
		System.out.println("Admission starts at 10.05.2024");
	}

	public static void main(String[] args)

	 {
		
		VelsTech v1=new VelsTech();
		System.out.println(v1.collegeName);
		
		
		v1.addmission();
		 v1.notification();
		 v1.feesDetails();
		 v1.feesDetails(5000);
		v1.feesDetails(5000,1000);
	}	

}


