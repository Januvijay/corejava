package corejava;

public class Student {
	String studentName;//global variable or instance variable
	int phoneNo;
	String address;

	
	//Default constructor
	public Student() {
    System.out.println("Default constuctor started");
	}

	
	//parameter constructor
	public Student(String studentName, int phoneNo, String address)

	{
		this.studentName=studentName;//calling global variable using this keyword
		this.phoneNo=phoneNo;
		this.address= address;
		System.out.println("parameter construtor called");
		

	}
	
	
	//copy constructor
	public Student(Student original)
	{
		this.studentName=original.studentName;
		
		this.phoneNo=original.phoneNo;
		this.address= original.address;
		
		
	}
	public void total()//intialize method
	{
		int total=400;//local variable initialize
		System.out.println(total);
		
	}

	//main method
	public static void main(String[] args)
	
	{
		Student student = new Student();//default constructor called
		System.out.println(student.studentName);
		Student studentOne=new Student("jj", 1245, "bng");//parameter constructor called
		System.out.println(studentOne.studentName);
		student.total();
		studentOne.total();
		Student studentTwo=new Student(studentOne);//copy constructor called
		System.out.println(studentTwo.studentName);
		String stringName="janani";
		String newName=new String("janani");
		System.out.println(stringName);
		System.out.println(newName);
	}

}
