package String;
import java.util.Arrays;

public class Reverse_wordbyword {

	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		s=s.toLowerCase();
		
		String rev1="";
		
		String word[]=s.split("");
		for(String w:word) {
			String rev = "";
			
			for (int i=w.length()-1; i>=0; i--) {
				rev = rev+w.charAt(i);
				}
		rev1=rev1+rev;
		}
	System.out.println(rev1);
	}
}
