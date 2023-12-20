package Package1;

public class overloading {

	public void display(){
		System.out.println("No arg method");
	}
	
	public int print(int a) {
		System.out.println("Integer");
		return 45;
	}
	public void print(int a, int b) {
		System.out.println("two int arguments");
	}
	public void print(float f, char c) {
		System.out.println("float, char method");
	}
	
	public void print(char c, float f) {
		System.out.println("character float method");
	}
	//METHOD OVERLOADING
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading g = new overloading();
		
		g.print(1000);
		g. print('v', 99.9f);	// character, float method
		g.print(63.7f, 'b');	//float char method
		g.print(4, 7);			//two int arg
	}

}


