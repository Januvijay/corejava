package inheritance;

public class CietCollege extends AnnaUniversity

{
//method over riding because the college is over ridden in parent class .
	public void collegeName() {
		System.out.println("             CIET            ");
		System.out.println("Admission starts at march 07 2024.");
	}

	public static void main(String[] args)

	{

		CietCollege c1 = new CietCollege();
		c1.collegeName();
		c1.notification();
		c1.feesDetails();
		c1.feesDetails(2500);
		c1.feesDetails(2500, 1000);

	}

}
