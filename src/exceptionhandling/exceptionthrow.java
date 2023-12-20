package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exceptionthrow {

	public static void main(String [] args)
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter the String");
		int k = 0;
		try {
			String  s= br.readLine();
			int a =Integer.parseInt(s);
			System.out.println(a+20);
			
			if (k==0)
			{
				throw new ArithmeticException();
			}
			}
	catch(ArithmeticException e) {
		System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Last Statement");
		}
	}

}
