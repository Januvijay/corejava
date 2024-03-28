package corejava;
;


public class Employee {
	//instance variable or Global variable
	String name;
	int no;
	String address;
	int salary;
	String email;
	
	
    public  Employee() { 
		System.out.println("constructor called");
		System.out.println(name);
		System.out.println(no);
		System.out.println(address);
		System.out.println(salary);
		System.out.println(email);//default constructor
	}
    public Employee(String name,int no,String address,String email,int salary)
    {
    	this.name=name;
    	this.address=address;
    	this.no=no;
    	this.email=email;
    }
    public Employee(Employee original)
    {
    	this.name=original.name;
    	this.address=original.address;
    	this.no=original.no;
    	this.email=original.email;
    	
    	
    }
    	
    
    
	//main function
	public static void main(String[]args)
	{
		Employee employee =new Employee();
		Employee employeeone=new Employee("vj", 4545, "xxx",".gmail",7777);
		Employee employeetwo=new Employee("janu", 4545, "xxx",".gmail",7777);
		
		System.out.println(employeeone.name);
		System.out.println(employeeone.no);
		System.out.println(employeeone.address);
		System.out.println(employeeone.email);
		System.out.println(employeeone.salary);
	Employee copyEmployee=new Employee(employeeone);
	
	System.out.println("---------------------------copy constructor-------------------");
	System.out.println(copyEmployee.name);
	System.out.println(copyEmployee.no);
	System.out.println(copyEmployee.address);
	System.out.println(copyEmployee.email);
	System.out.println(copyEmployee.salary);
	System.out.println("=============================================");
	System.out.println(employeeone.hashCode());
	System.out.println(copyEmployee.hashCode());
	//hash code is to find object allocate no
	
	
	}
    
}
	

