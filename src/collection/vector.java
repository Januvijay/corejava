package collection;


import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class  vector {

	public static <E> void main(String[] args) {
		
		Vector<String > test=new Vector();
		//add objects to vector
		test.add("Maths");
		test.add("Maths");
		test.add("science");
		test.add("english");
		test.add("chemistry");
		//test.add(10);
		System.out.println(test);
		//add only one type of variable
		
        Vector<String> test1=new  Vector<String>();
        test1.add("janani");
		test1.add("vijay");
		test1.add("kokila");
		test1.add("ram");
		test1.add("shiva");
		
        
		System.out.println(test1);
		
		//using the get method
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
		
		Vector<Integer> myNumbers = new Vector<Integer>();
		    myNumbers.add(10);
		    myNumbers.add(15);
		    myNumbers.add(20);
		    myNumbers.add(25);
		    
		    System.out.println(myNumbers);
		    System.out.println("==================================");
		    Vector<Character> char1= new  Vector<Character>(); 
		    char1.add('a');
		    char1.add('b');
		    char1.add('c');
		    char1.add('d');
		    char1.add('e');
		    char1.add('f');
		    System.out.println("character:"+char1);
		    System.out.println("=============printing hashcode==========");
		    System.out.println(test.hashCode());
		  
		    
		    //using for loop in ArrayList
		    System.out.println("using for loop");
		    for (int i = 0; i < test.size(); i++) {
		        System.out.println(test.get(i)); 
		    }
		    
		    //using for each loop
		    
		    System.out.println("using for each loop");
		    for(String i:test1)
		    {
		    	System.out.println(i);
		    }
		    System.out.println("using for each loop");
		    for(Integer i:myNumbers) {
		    	System.out.println(i);
		    }
		    
		    //sort an vector
		    
		    System.out.println("                                                                                                                                                                                                                                  ");
		    System.out.println("sort using arraylist");
		    Collections.sort(test1);
		    System.out.println(test1);
		    
		    
		    System.out.println("=====================using enumeration==========");
		    Enumeration enumeration= Collections.enumeration(test1);
 
		    System.out.println(
		            "printing each enumeration constant by enumerating through the Vector:");
		        while (enumeration.hasMoreElements()) {
		            System.out.println(enumeration.nextElement());
		        }
		    
		  
}
}
		    
		    
		    
		    
		
		   
