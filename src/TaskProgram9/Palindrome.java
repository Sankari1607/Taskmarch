package TaskProgram9;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String");
		
		Scanner input = new Scanner(System.in);
		
		String s= input.next();
		
		char[] c = s.toCharArray();
		
		String e = "";
		
		for (int i = c.length-1; i>=0; -- i)
		{
			e = e + c[i];
			
		}
		System.out.print(e);
		
		if(s.equals(e))
		{
			System.out.print(" :The String is Palindrome");
		}
		else
		{
			System.out.print(" :The String is not Palindrome");
	
		}
	}

}
