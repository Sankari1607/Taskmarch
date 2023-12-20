package Package1;

public class Nestedf {
	public static void main(String[] args) {
	
	for (int i=1; i<=5; i++) {

	for (int j =1; j<= 5; j++) {

		if ((i==3) && (j==3))
		continue; //break;
		System.out.print("*");
	}
	System.out.println();
	}
}
}