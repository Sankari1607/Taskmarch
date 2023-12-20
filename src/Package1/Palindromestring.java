package Package1;

import java.util.*;
public class Palindromestring {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

String rev =" ";  // objects of String Class

System.out.println("Enter a String/number to check if it is a Palindrome");

Scanner input = new Scanner(System.in);
String s = input.next();
String s = Scanner.nextLine().toCharArray();

//original = input.nextLine();
//String s = input.next();

//int s = original.length();

for(int i = s.length()-1; i>= 0; i--)
{
//rev = rev + original.charAt(s);
	rev = rev+s.charAt(i);
}
if (s.equals(rev))

	System.out.println("Entered string/number is a Palindrome.");

	else
		
	System.out.println("Entered string/number isn't a palindrome.");
	

	}

}
