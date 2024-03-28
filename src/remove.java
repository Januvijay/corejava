
public class remove {
	public static void main(String[] args) 
	{
		String s="indian";
		int i=0;
		String v="";
		char[] ch=s.toCharArray();
//		for(int m=0;m<s.length();m++)	
//		{  char l=s.charAt(m);
//		   String s1=Character.toString(l);
//		   //System.out.println(s1);
//			if(v.indexOf(s1)==-1)
//			
//				v=v+s.charAt(m);
//			
//			
//		}
//		System.out.println(v);
//			
		
		String s1="";
		for (i=0;i<s.length();i++)
		{
			for (int j=0;j<i;j++)
			{
		
			if(ch[i]==ch[j])
				{
				
				 s1=ch[i]+s1;
				 s =s.replaceAll(s1, "");
				//print repeated characters
				}
			
//			
//			 if(ch[i]!=ch[j])
//			 {
//			 v=v+ch[i];
//				
//			 }
			}
		}System.out.println("Duplicate character=="+s1);
		
		System.out.println("word removed duplicate character=="+s);	
	
		int indexOf1=s.indexOf("w");
		if(indexOf1==-1) {
			System.out.println("the character is not present");
		}else 
		System.out.println("the character is  present");
		}
	
}


			
				
			
		
	


