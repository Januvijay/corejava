package String;
//program using charAt()
class reverseString {
    public static void main (String[] args)
{
       
        String str= "Welcome home";
        String s="";
        
        
        char ch ;
       
      System.out.print("Original word: ");
      System.out.println(str); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        //System.out.println(i);
        //System.out.println(ch);
        //extracts each character
        s= ch+s; 
        
     //adds each character in front of the existing string
        
     
      }
      
	
      System.out.println("Reversed word: "+s);
    }
}
	
			

