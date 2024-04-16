package collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class linkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> subject =  new LinkedHashSet<String>();
		subject.add("maths");
		subject.add("maths");
		subject.add("english");
		subject.add("english");
		subject.add("science");
		subject.add("Tamil");
		System.out.println(subject);
		
		System.out.println(subject);
		
		
		
		System.out.println(subject.contains("Mazda"));
		System.out.println(subject.contains("maths"));
		//System.out.println(subject.equals(subject1));
		
		System.out.println(subject.iterator());
		System.out.println("================================================");
		System.out.println("=============================using iterator====================================");
		
	   Iterator s1=subject.iterator();
	   while(s1.hasNext())
	   {
		   System.out.println(s1.next());
	   }
	    
	
		
		
	}
}
