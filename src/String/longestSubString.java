package String;

import java.util.Arrays;

public class longestSubString {

	
	  static int countNonEmptySubstr(String str)
	    {
	        int n = str.length();
	        return n * (n + 1) / 2;
	    }
	     
	   
	    public static void main(String args[])
	    {
	        String str = "janani";
	        System.out.println(
	                  countNonEmptySubstr(str));
	        String[] StrArray=new String[100];
	        int n = 0;
	    
	        for(n=0;n<str.length();n++)
	        {
	        for (int i = 0; i <str.length()  ; i++)
	        {
	        	String v=str.substring(i, i + n);
	        	//System.out.println(v);
	        	StrArray[i]=str.substring(n);
	        		
	        	
	        	}
	        	//String g=str.substring(i);
	        	//String h=str.substring(i+n);
	        	//if(g.length()>h.length())
	        	//{
	        	//	temp=g;
	        	//	g=h;
	        	//	h=temp;
	        		
	        	//}
	        	//System.out.print(str.substring(i, i + n)+"     " ); 
	        	//String v1=str.substring(i);
	        	//String v1=str.substring(n);	        	//System.out.println("======================================================");
        	//System.out.println(v);
        	//if()
	        	//System.out.println(v1);
	        	//System.out.println("==============================********************============");
	     //   	if(v.length()>=v1.length())
	   //     	{
	     //   	j=v;
	       // 	}
	        		
	    //System.out.println(j);
	       // System.out.println(g);
		
	        
	    }}
	        
	        
	    }
	    
	
	 