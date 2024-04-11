package collection;

import java.util.LinkedList;

public class linkedList {
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add("janu");
		list.add("vijay");
		list.add(10);
		list.add(11);
		
		System.out.println(list);
		System.out.println("==============removing an elemnt==================");
		list.remove("vijay");
		System.out.println(list);
		System.out.println("=================adding first===================");
		list.addFirst("shiva");
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
		LinkedList list1=new LinkedList();
		
		list1.add("janu");
		list1.add("vijay");
		list1.add(10);
		list1.add(13);
		
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
		
		
		
	}

}
