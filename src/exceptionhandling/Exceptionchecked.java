package exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exceptionchecked {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String s = null;
		System.out.println("enter the Input");
		try {
		s = br.readLine();
		}
		catch(Exception e)
		
				{
				System.out.println(e);
		}
		System.out.println(s+ 1000);
	}

}
