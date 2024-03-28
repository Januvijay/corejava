package Banking;

public class RbiBank {
	public void notification() {
		System.out.println("The housing loan interest is updated from 10% to 12% from febrauary 28 2024");
	}
	public void interest() {
		
		System.out.println("The new interest is (loanamount*12/100)");
	}

	public static void main(String[] args) {
		
		RbiBank a1=new RbiBank();
		a1.notification();
		a1.interest();
		
	}
}
