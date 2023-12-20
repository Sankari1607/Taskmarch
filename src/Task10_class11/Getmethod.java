package Task10_class11;
import java.util.Scanner;

public class Getmethod {
	public static void main(String arg[]) {
		
	person thisperson = new person();
String personname;
int personage;

Scanner input = new Scanner(System.in);
System.out.println("Enter the personname:");
personname = input.next();
System.out.println("Enter the age:");
personage = input.nextInt();

thisperson.name=personname;
thisperson.age=personage;

//thisperson.setname(personname);
//thisperson.setage(personage);

System.out.println("The person name is:" + thisperson.getname());
System.out.println("The person age is:" + thisperson.getage());

	}
	
	
}
