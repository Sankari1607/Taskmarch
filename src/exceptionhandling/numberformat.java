package exceptionhandling;

public class numberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "thinlkaa";
		String n = "100";
		int a = 0;
		try {
			a = Integer.parseInt(s);
			}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println(a+10);
	}

}
