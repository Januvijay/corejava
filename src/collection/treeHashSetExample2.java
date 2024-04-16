package collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class treeHashSetExample2 {

	public static void main(String[] args) {
		TreeSet<String> subject = new TreeSet<String>();
		subject.add("maths");
		subject.add("maths");
		subject.add("english");
		subject.add("english");
		subject.add("science");
		subject.add("Tamil");
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
		TreeSet<Integer> subject1 = new TreeSet<Integer>();
		subject1.add(10);
		subject1.add(40);
		subject1.add(50);
		subject1.add(3);
		subject1.add(22);
		subject1.add(1);
		System.out.println(subject1);
	
		
		
	}
}
