package Package1;
import java.util.Scanner;

public class allmathsinone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input First Number:");
		int num1 = in.nextInt();
		
		System.out.print("Input Second Number:");
		int num2 = in.nextInt();
		
		System.out.println(num1 + " + " +num2 + "  =  " + (num1 + num2));
		
		System.out.println(num1 + " - " +num2 + "  =  " +(num1 - num2));
		
		System.out.println(num1 + " * " +num2 + "  =  " + (num1 * num2));
		
		System.out.println(num1 + " / " +num2 + "  =  " + (num1 / num2));
		
	}

}
