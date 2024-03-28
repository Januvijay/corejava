package String;

import java.util.Arrays;

public class s {
	public static void main(String[] args) {
		

		String s="INDIA";
		
		int temp;
		char[] charArray=s.toCharArray(); 
	int size=charArray.length;
		for(int i = 0; i < size; i++ ) {
	         for(int j = i+1; j < size; j++) {
	             if(charArray[i]>charArray[j]) {
	                temp = charArray[i];
	                charArray[i] = charArray[j];
	                charArray[j] = (char) temp;
	             }
	          }
	       }System.out.println("Third largest element is: "+Arrays.toString(charArray));
	
//		
		
	}}

