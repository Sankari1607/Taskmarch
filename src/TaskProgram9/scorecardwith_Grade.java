package TaskProgram9;
import java.util.Scanner;

public class scorecardwith_Grade {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the Marks:");
		Scanner input = new Scanner(System.in);
		int marks = input.nextInt();
		
		
		if(marks>100)
		{
			System.out.println("Invalid marks");
		}
		else if(marks==100) {
			System.out.println("The Student Grade is : S ");
		}
		else if((marks>=90) && (marks<=99))
			{
			System.out.println("The Student Grade is : A ");
			
		}
		else if((marks >=80) && (marks<=89)){
			System.out.println("The Student Grade is:  B");
		}
		else if((marks >=70) && (marks<=79)){
			System.out.println("The Student Grade is:  C");
		}
			else if((marks >=60) && (marks<=69)){
				System.out.println("The Student Grade is:  D");
		}
			else if((marks >=50) && (marks<=59)){
				System.out.println("The Student Grade is:  E");
			}
				else {
					System.out.println("The Student Grade is: F");
				}
					
	}
	
}

//100 -S
//90-99- A
//80-89 = B
//70-79 C
//60-69 D
//50-59 E
//< 50 F