package Package1;

public class mathtype1 {

	public void add() { // without return type , without argument
		int a= 10;
		int b=20;
		System.out.println(a+b);
	}
	
	public void sub(int c, int d, int o) {	//without return type, with argument
		System.out.println(c-d);
	}
	public int mul() {			// with return type, without argument
		int a= 10;
		int b = 20;
		System.out.println(a*b);
		return a*b;
	}
		public float div(float x, int y) {	// with return type, with argument
			System.out.println(x/y);
			return (x/y);
		
		
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mathtype1 m = new mathtype1();
		m.add();
		m.sub(40,20,67);	//20
		int ans=m.mul();		
		System.out.println("The answer that i got is: " + ans );
				
		System.out.println(m.div(9.8f, 8));
	}

}
