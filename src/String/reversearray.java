package String;

public class reversearray {
	

	public static void main(String[] args) {
		
	

	
	String string="Welcome to home";
	System.out.println(string);
	System.out.println("===============lower and uppercase============");
	//to upper case and lower case.
	String word=string.toUpperCase();
	System.out.println("uppercase==="+word);
	String word2=string.toLowerCase();
	System.out.println("lowercase=="+word2);
	System.out.println("===========concation word=============");
	String newSentence= string.concat(" VIJAY");//joining string in existing string.
	System.out.println(newSentence);
	System.out.println("=================lengthof a sentence=========");
	//to find out length
	int size=newSentence.length();
	System.out.println("length=="+size);
	
	//to find starting and ending letter.
	System.out.println("==================start and end with===========");
	boolean startswith;
    startswith=string.startsWith("n");
    System.out.println(startswith);
    
    boolean endswith;
    endswith=string.endsWith("e");
    System.out.println(endswith);
    
    //splitting sentence
    String[] spiltSentence=newSentence.split("\\s+");
    
    System.out.println("============split sentence============");
    System.out.println(spiltSentence);
   
	System.out.println(spiltSentence[1]);
	System.out.println(spiltSentence[2]);
	
	System.out.println("======================index===================");
	//index of
	int indexOf=newSentence.indexOf(118);
	System.out.println(indexOf);
    
	int indexOf1=newSentence.indexOf("J");
	System.out.println(indexOf1);
	
	int x='v';
	System.out.println(x);
	
	// reverse String using array
	System.out.println("==================rev word================");
	
	
	
	char[] word1 = newSentence.toCharArray();
	 
    for (int i = word1.length - 1; i >= 0; i--)
        System.out.print(word1[i]);
}
}
	
	
	
	
    
	

	


