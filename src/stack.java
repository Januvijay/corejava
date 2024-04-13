import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<String> s=new Stack();//last in first out 
		s.push("janu");
		s.push("microsoft");
		s.push("tcs");
		s.push("infosys");
		
		System.out.println(s);
		
		System.out.println(s.peek());//to get last element
		s.add("janu");
		System.out.println(s);
		
		s.pop();//remove last object
		System.out.println(s);
		//s.elementAt()
		
	}
}
