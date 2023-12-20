package String;

import java.util.Scanner;

public class spacestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the string");
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		System.out.println("The String Length is:" + s.length());
		for(int i=0; i<=s.length()-1; i++)
		{
			System.out.print(s.charAt(i)+ " ");
		}
		
	}

}
