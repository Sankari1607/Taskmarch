package exceptionhandling;

public class Excepti1 {

	public static void main(String[] args) { // TODO Auto-generated method stub
		int [] arr = new int [3];
		arr[0] = 100;
		arr[1]=101;
		arr[2]= 102;
		try {
			arr[3] = 103;
			}
		catch (Exception e) {
			System.out.println(e);
				
		}
		System.out.println(1+2);
		

	}

}
