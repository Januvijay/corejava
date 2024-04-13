package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList test=new ArrayList();
		//add objects to arraylist
		test.add("Maths");
		test.add("Maths");
		test.add("science");
		test.add("english");
		test.add("chemistry");
		test.add(10);
		System.out.println(test);
		//add only one type of variable
		
        ArrayList<String> test1=new ArrayList<String>();
        test1.add("janani");
		test1.add("vijay");
		test1.add("kokila");
		test1.add("ram");
		test1.add("shiva");
		
        
		System.out.println(test1);
		
		//using get method
		System.out.println("using getmethod by index value::"+test1.get(3));
		//using set method
		test.set(4,"physics");
		System.out.println("using set method inserted element in 4th postion"+test);
		//using remove method
		test.remove(0);
		test.remove("physics");
		test.remove(Integer.valueOf(10));
		System.out.println("using remove method removed one maths"+test);
		System.out.println(test);
		//find size of array
		System.out.println("the size of array::"+test.size());
		
		//wrapper class
		
		 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		    myNumbers.add(10);
		    myNumbers.add(15);
		    myNumbers.add(20);
		    myNumbers.add(25);
		    
		    System.out.println(myNumbers);
		    System.out.println("==================================");
		    ArrayList<Character> char1= new ArrayList<Character>(); 
		    char1.add('a');
		    char1.add('b');
		    char1.add('c');
		    char1.add('d');
		    char1.add('e');
		    char1.add('f');
		    System.out.println("character arraylist:"+char1);
		    System.out.println("=============printing hashcode==========");
		    System.out.println(test.hashCode());
		  
		    
		    //using for loop in arraylist
		    System.out.println("using for loop");
		    for (int i = 0; i < test.size(); i++) {
		        System.out.println(test.get(i)); 
		    }
		    
		    //using for eachloop
		    
		    System.out.println("using for each loop");
		    for(String i:test1)
		    {
		    	System.out.println(i);
		    }
		    System.out.println("using for each loop");
		    for(Integer i:myNumbers) {
		    	System.out.println(i);
		    }
		    
		    //sort an arraylist
		    
		    System.out.println("                                                                                                                                                                                                                                  ");
		    System.out.println("sort using arraylist");
		    Collections.sort(test1);
		    System.out.println(test1);
		    
		    
		    System.out.println("=====================using iterator==========");
		    Iterator<Integer> it = myNumbers.iterator();
		    while(it.hasNext())
			{
				Integer i=it.next();
				System.out.println(i+"  ");
				
			}
		    
		    
		    ListIterator<String> it1 = test1.listIterator();
		    
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
		    
		    
		    
		    
		
		   
