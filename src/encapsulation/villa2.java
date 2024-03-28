package encapsulation;

public class villa2 {
public static void main(String[] args) {
		
		villa v=new villa();
		v.setVillaNumber(002);
		v.setOwnerName("Janani");
		v.setPhoneNo(1234555);
		v.setAddress("3rd cross");
		
		
		int villaNo=v.getVillaNumber();
		String name=v.getOwnerName();
		long phno=v.getPhoneNo();
		String add=v.getAddress();
		
		
	
		System.out.println("villa number=="+villaNo);
		System.out.println("owner name=="+name);
		System.out.println("phone number=="+phno);
		System.out.println("address=="+add);
		
	}


}
