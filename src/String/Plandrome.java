package String;
import java.util.Scanner;
public class Plandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enther the String:");
		Scanner input = new Scanner(System.in);
		
		String s=input.next();
		
		String rev = "";
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
			
		}
		System.out.println("The reversed String: " + rev);
		
		if(s.equals(rev))
		{
			System.out.println("The String is Palindrome");
		}
	
		else
		{
			System.out.println("The String is not Palindrome");
		}
			}

}
