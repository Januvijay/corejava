import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		HashSet<String> subject = new HashSet<String>();
		subject.add("maths");
		subject.add("maths");
		subject.add("english");
		subject.add("english");
		subject.add("science");
		subject.add("Tamil");
		System.out.println(subject);
		
		
		
		System.out.println(subject.contains("Mazda"));
		System.out.println(subject.contains("maths"));
		
		
		
		
		
	}
}
