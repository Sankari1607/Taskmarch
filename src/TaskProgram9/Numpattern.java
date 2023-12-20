package TaskProgram9;

import java.util.Scanner;
public class Numpattern {
	
	public static void printpattern(int num)
	{
				int n=1;
		for (int i =1; i<=num; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(n +  " ");
				n++;  
			}
		System.out.println(   );
		}
		
	}
	public static void main(String args[])
	{
		int num =6;
		printpattern(num);
	}
}
