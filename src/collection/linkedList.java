package collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList {
	

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add("janu");
		list.add("vijay");
		list.add(10);
		list.add(11);
		
		System.out.println(list);
		 
		
		LinkedList<String> list1=new LinkedList<String>();
		
		list1.add("janu");
		list1.add("vijay");
		list1.add("Ram");
		list1.add("SHIV");
		System.out.println(list1);
		
		
		System.out.println("==============removing an elemnt==================");
		list.remove("vijay");
		System.out.println(list);
		System.out.println("=================adding first===================");
		list.addFirst("mohana");
		System.out.println(list);
		System.out.println("==============get an element===============");
		
		System.out.println(list.get(3));
		
		System.out.println(list.contains(10));
		
		System.out.println("==============add last element===============");
		list.addLast("welcome");
		System.out.println(list);
		System.out.println("===============add value through index value===============");
		list.add(2,"home");
		System.out.println(list);
		LinkedList list2=new LinkedList();
		
		list1.add("shanya");
		list1.add("athmika");
		list2.add(10);
		list2.add(13);
		
		LinkedList list3=new LinkedList();
		
		list3.add(10);
		list3.add(13);
		
		list.descendingIterator();
		System.out.println("=================================");
		System.out.println("list1 is same as list ="+list1.containsAll(list));
		System.out.println("==========print hashcode==============");
		System.out.println(list.hashCode());
		System.out.println("list is empty or not");
		System.out.println(list3.isEmpty());
		System.out.println( list.listIterator());
		System.out.println("===========================================using iterator============================================================");
		
		
		Iterator<String> listIterator = list1.iterator();
		
		while(listIterator.hasNext())
		{
			String i=listIterator.next();
			System.out.println(i+"  ");
			
		}  
		
		System.out.println("=================================================================");
		System.out.println("==============================================");
		System.out.println("================================using list iterator================");
		//using list iterator
		ListIterator<String> it1 = list1.listIterator();
	    
	    // Condition check whether there is element in List
        // using hasNext() which holds true till
        // there is single element in List
		
		System.out.println("========================using hasnext===============");
	    while(it1.hasNext()) {
	    	System.out.println(it1.next());
	    }
	    
	    System.out.println("=======================================");
	    System.out.println(" ===============using list iterator to retrive previous element=============");
	    while(it1.hasPrevious())
	    {
	    	System.out.println(it1.previous());
	    
} 
		  
		
		//=");
		//while(listIterator.hasNext())
		//{
		
		//boolean m=listIterator.hasNext();
		//System.out.println(m+"   ");
		}
		
		//listIterator.hasNext();
		//listIterator.next();
		
		
		
		
	



}
