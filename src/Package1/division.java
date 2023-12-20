
package Package1;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Input the First number:");
		
		int a = input.nextInt();
		System.out.print("Input the Second number:");
		
		int b = input.nextInt();
		int d = (a/b);
		
		System.out.println();
		System.out.println("The division of a and b is:" +d);
		
	}

}
