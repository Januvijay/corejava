package String;

public class sssss { 
	static int countNonEmptySubstr(String str)
{
    int n = str.length();
    return n * (n + 1) / 2;
}
 
// Driver code
public static void main(String args[])
{
    String s ="bcabcabbxz" ;
    System.out.println(
              countNonEmptySubstr(s));



    
    
    
    
    
	for (int i=0;i<s.length();i++)
	{
		for( int j=i;j<=s.length();j++)
		{
		String subString=s.substring(i, j);
		System.out.println(subString);

          
	
	}
		
	
	}System.out.println("===============longest substring======================");
	String v=s.substring(1, s.length());
	String b=s.substring(0, s.length()-1);
	System.out.println(v);
	System.out.println(b);

}}