package Package1;

import java.util.Scanner;
public class biggerno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter two numbers");
		Scanner input = new Scanner (System.in);
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		int d = input.nextInt();
		if (a>b && a>c && a>d)
			System.out.println(a + "is the biggest number");
		else if(b>c && b>d)
			System.out.println(b + "is the biggest number");
		else if(c>d)
			System.out.println(c + "is the biggest number");
		else
			System.out.println(d + "is the biggest number");

	}

}
