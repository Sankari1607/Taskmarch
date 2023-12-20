package Task11class13;

public class Invalidageexceptionless18 {

	static void checkAge(int Age) {
	if (Age<18)
	{
		
		throw new ArithmeticException("Access denied - You must be at least 18 years old");
		
		
	}
	else {
		System.out.println("Access granted  - You are old enough!");
		
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(51);		//Set age to 15(which is below 18)
	}

}
