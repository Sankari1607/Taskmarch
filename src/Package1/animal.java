package Package1;

public class animal {

	int a=0; // member or instance var
	String bite = "YES";	
	public void eat() {
		
		System.out.println("eat method");  //methods
		
		
	}
	public void bark() {
		
		System.out.println("bark method");
	}
	public void tail() {
		System.out.println("tails of animal");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;		//local vari
	
		// syntax classname obj = new classname();
		animal dog = new animal();
		
		
		System.out.println("dog.bite");
		
		dog.eat ();
		dog.bark ();
		dog.tail();
		
		animal lion = new animal();
		
	
	
	}

}
