package Package2;

public class conparameter {
	int a;
	int b;
	public conparameter(int x, int y) {
		a=x;
		b=y;
	}
	public void add() {
		System.out.println(a+b);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conparameter c = new conparameter(10,120);
		c.add();
		
	}

}
