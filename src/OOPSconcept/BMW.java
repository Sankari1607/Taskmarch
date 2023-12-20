package OOPSconcept;

public class BMW extends Car_inhertance {

	public void color() {
		System.out.println("color of BMW");
	}
	public void speed() {
		System.out.println("speed of BMW");
	}
	public void start() {
		System.out.println("start of bmw with addition");
		System.out.println(5+6);
	}
	public void key() {
		System.out.println("Keys overriden");
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();
		b.color();
		b.speed();
		b.start();
		b.stop();
		b.key();
		
		Car_inhertance c3 = new Car_inhertance();
		c3.start();
		
		Car_inhertance c2= new BMW();
		c2.start();
		c2.stop();
		//c2.key();
		
	}

}
