package Package1;

import java.util.Scanner;
public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a string Value:");
		char[]letters = scanner.nextLine().toCharArray();
		
		System.out.print("The Reverse string:");
		for (int i = letters.length-1; i>=0; i--) {
			
			System.out.print(letters[i]);
			
		}
		System.out.print("\n");
	}

}
