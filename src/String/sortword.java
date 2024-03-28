package String;

public class sortword {

	
public static void main(String[] args) {
	

	String s="INDIA";
	String v1="";
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		for(int j=0;j<i;j++)
		{
			if((ch[i])<ch[j])
			{
				v1=ch[i]+v1;
			}System.out.println(v1);
			
		}
			
			
	}
	
	
}


}
