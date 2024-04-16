package collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
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
		
		
		Iterator<String> s1 = s.iterator();
		System.out.println("============================using iterator=====================================");
		while(s1.hasNext())
		{
	    String  i=s1.next();
	      System.out.println(i);
	}
		
		System.out.println("=======================================================================");
		System.out.println("=================================using enumeration======================================");
	     Enumeration e = s.elements();
	     
	        // hasMoreElements() is used to check whether there
	        // are more element to be enumerated
	        while (e.hasMoreElements()) {
	 
	            // nextElement() is used to return the next
	            // object in enumeration
	            System.out.println(e.nextElement());
	        }
	        
	        
	        System.out.println("==============================================================");
	        System.out.println("===========using list iterator=====================");
	       
		    ListIterator<String> it1 = s.listIterator();
		    
		    // Condition check whether there is element in List
	        // using hasNext() which holds true till
	        // there is single element in List
		    while(it1.hasNext()) {
		    	System.out.println(it1.next());
		    }
		    
		    System.out.println("=======================================");
		    System.out.println(" ===============using list iterator toretrive previous element=============");
		    while(it1.hasPrevious())
		    {
		    	System.out.println(it1.previous());
		    
	} 
}
}
