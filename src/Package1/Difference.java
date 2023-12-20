package Package1; // with return type, with argument

public class Difference {

	public void display() {
		System.out.print(2+3);
		
}
	public int fun() {
		int a=8;
		int b = 10;
		
		return (a+b);
	}
	
	public int fun2() {
		return 100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Difference d = new Difference ();
	
	d.display();
	
	int v=d.fun();
	
	System.out.println(v);
	System.out.println(v+d. fun2());
	}

}
