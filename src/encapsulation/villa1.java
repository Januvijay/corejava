package encapsulation;

public class villa1 {
	
	public static void main(String[] args) {
		
		villa v1=new villa(12," janu"," xxx", 0);
		System.out.println(v1.getAddress());
		villa v=new villa();
		v.setVillaNumber(001);
		v.setOwnerName("vijay");
		v.setPhoneNo(1234555);
		v.setAddress("3rd cross");
		
		
		int villaNo=v.getVillaNumber();
		String name=v.getOwnerName();
		long phoneNo=v.getPhoneNo();
		String address=v.getAddress();
		
		
	
		System.out.println("villa number=="+villaNo);
		System.out.println("owner name=="+name);
		System.out.println("phone number=="+phoneNo);
		System.out.println("address=="+address);
		
	}

	
	}


