package String;
//program using String builder
public class StringBuilder1 {
	public static void main(String[] args) {
		String s="name=";
		StringBuilder name=new StringBuilder();
		name.append(s+"Janani");
		name.append("vijay");
		System.out.println(name);
		name.reverse();
		System.out.println(name);
		StringBuilder name1=new StringBuilder();
		name1.append("vijay");
		StringBuilder name2=new StringBuilder();
		name2.append(name1);
		name2.reverse();
		System.out.println(name2);
		
	}

}
