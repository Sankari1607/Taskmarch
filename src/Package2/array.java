package Package2;

public class array {			// one dimensional array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]smart = new int[5];
		smart[0] = 46;
		smart[1]=54;
		smart[2]=78;
		smart[4]=88;
		int []ar = {3,7,66,44,90,88};
		
		System.out.println(ar.length);
		
		for (int i = 0; i<=smart.length; i++) {
			System.out.print(smart[i]+ " ");
			
		}
		System.out.println();
		//advanced for loop
		for (int b: smart) {
			System.out.print(b+ "");
		}
				
	}

}
