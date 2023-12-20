
package TaskProgram9;

import java.util.Scanner;
public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to be Reversed:");
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		String rev = "";
		
		for (int i=s.length()-1; i>=0 ; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("The Reverse String is:  " + rev);
	}
		
}
