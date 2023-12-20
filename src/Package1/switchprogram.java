package Package1;

import java.util.Scanner;
public class switchprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a Number");
Scanner input = new Scanner(System.in);
int n = input.nextInt();
switch(n) {
case 1:
	System.out.println("Sunday");
case 2:
	System.out.println("Monday");
case 3:
	System.out.println("Tuesday");
break;
default:
	System.out.println("Please enter the correct number");
}

	}

}
