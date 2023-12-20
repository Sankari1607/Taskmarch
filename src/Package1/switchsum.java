package Package1;
import java. util. Scanner;

public class switchsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("ENter the number");
	Scanner input = new Scanner(System.in);
int n= input.nextInt();		
		
int sum = 0;
int r=0;
		while (n>0) {
			r=n%10;  //2
			sum = sum+r;			//0+2 = 2 sum = 2
			n=n/10;					// n = 3457
	
	
}
System.out.println(sum);
	}

}


