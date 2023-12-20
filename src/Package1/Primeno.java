package Package1;

//import java.util.Scanner;
public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 11;
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("input a no:");
		//int num; 
		for(int i=2; i<num-1 ; i++) {
			
			count = 0;
			if(num%i== 0) {
				count ++;
				break;
				
			}
		}
		
		if (count==0) {
			System.out.println("PRIME");
			
		}
		else
			System.out.println("COMPOSITE");
	}	
	
		

}
