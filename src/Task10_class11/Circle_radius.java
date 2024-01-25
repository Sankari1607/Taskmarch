package Task10_class11;

public class Circle_radius {

	private static double radius;
	
	public Circle_radius(double radius) {
		// TODO Auto-generated constructor stub
	
	
	this.radius = radius;	
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getArea() {
		return Math.PI * radius * radius;
	}
	
	public static double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 5;
		Circle_radius circle = new Circle_radius(r);
		System.out.println("Radius of the Circle is " + r);
		System.out.println("The are of the Circle is" + circle.getArea());
		System.out.println("The Circumference of the circle is " + circle.getCircumference());
		System.out.println();
		
		r= 9;
		circle.setRadius(r);
		System.out.println("Radius of the Circle is " + r);
		System.out.println("The are of the Circle is" + circle.getArea());
		System.out.println("The Circumference of the circle is " + circle.getCircumference());
		
		
	}

}
