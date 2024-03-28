package String;

public class sortstring {
	public static void main(String[] args) {

		String sentence = "My name is janani";
		String[] spiltSentence = sentence.split("\\s+");
		System.out.println(spiltSentence);

		// split sentence

		String i = spiltSentence[0];
		String j = spiltSentence[1];
		String k = spiltSentence[2];
		String l = spiltSentence[3];
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		// remove whitespace
		sentence = sentence.replaceAll("\\s", "");
		System.out.println(sentence);
		// replace character
		sentence = sentence.replaceAll("i", "y");
		System.out.println(sentence);
		char ch;
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String s4 = "";

		for (int n = 0; n < i.length(); n++) {
			ch = i.charAt(n);
			// System.out.println(i);
			// System.out.println(ch);
			// extracts each character
			s1 = ch + s1;
		}
		for (int v = 0; v < j.length(); v++) {
			ch = j.charAt(v);

			s2 = ch + s2;
		}
		for (int u = 0; u < k.length(); u++) {
			ch = k.charAt(u);

			s3 = ch + s3;
		}
		for (int m = 0; m < l.length(); m++) {
			ch = l.charAt(m);

			s4 = ch + s4;
		}

		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
	}
}
