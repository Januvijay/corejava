package encapsulation;

public class villa {
	private int villaNumber;
	private String ownerName;
	private String address;
	private long phoneNo;
	public villa()
	{
		
	}
	
	
public villa(int villaNumber, String ownerName, String address, long phoneNo) {
		
		this.villaNumber = villaNumber;
		this.ownerName = ownerName;
		this.address = address;
		this.phoneNo = phoneNo;
	}
public int getVillaNumber() {
	return villaNumber;
}
public void setVillaNumber(int villaNumber) {
	this.villaNumber = villaNumber;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
}
