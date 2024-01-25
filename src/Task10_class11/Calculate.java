package Task10_class11;

public class Calculate extends Account{
	private static int x;
	private static int y;
	int r, t;
	float si, amt;

	
	public Calculate(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	public void accept (int x, int y) {
		r=x;
		t=y;
		amt =0;
	}
		
	public void compute() {
		si = (balance * r*t)/100.0f;
		amt = si+balance;
	}
	public void display() {
		System.out.println("Account Number:"+ acno);
		System.out.println("Balance:" + balance);
		System.out.println("Interest:"+ si);
		System.out.println("Amount:"+ amt);
	}
	public static void main(String arg[]) {
		
		Calculate cal = new Calculate(x, y);
		cal.display();
	}

}
