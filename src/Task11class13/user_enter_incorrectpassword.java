package Task11class13;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class user_enter_incorrectpassword {

	public static void main(String[] args)
	{
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a given Password");
		String password = in.nextLine();
		List<String> errorList = new ArrayList<String>();
		
		while (!isValid(password, errorList))
		{
			System.out.println("The Password entered here is invalid");
			count = count ++;
			if (count == 3)
				
			{
				System.exit(count);
			}
			for (String error : errorList) {
				System.out.println(error);
			}
		
			System.out.println("Please enter a given password");
			password = in.nextLine();
		}
			System.out.println(" Your Password is:" + password);
		
	}

	

	private static boolean isValid(String password, List<String> errorList) {
		// TODO Auto-generated method stub
		errorList.clear();
		boolean flag = true;
		if (password.length()<11)
		{
			errorList.add("Password should not be less than 10 Charcters");
			System.out.println();
			flag = false;
		}
		return flag;
	}

	

}
