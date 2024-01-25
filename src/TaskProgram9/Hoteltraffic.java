package TaskProgram9;
import java.util.Scanner;
public class Hoteltraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		float room_rent;
		int stay;
		System.out.println("Enter the month for Booking the room:" );
		Scanner input= new Scanner(System.in);
		month = input.nextInt();
		System.out.println("Enter the room rent:");
		room_rent = input.nextInt();
				
		System.out.println("Enter the number of days booking room for stay:");
		stay = input.nextInt();
		String monthstring="";
		switch (month)
		{
		case 4:
			System.out.println("The amount is:" + ((stay*room_rent)+(room_rent * 20/100)));
			break;
		case 5:
			System.out.println("The amount is:" + ((stay*room_rent)+(room_rent * 20/100)));
			break;
		case 6:
			System.out.println("The amount is:" + ((stay*room_rent)+(room_rent * 20/100)));
			break;
		case 11:
			System.out.println("The amount is:" +((stay*room_rent)+(room_rent * 20/100)));
			break;
		case 12:
			System.out.println("The amount is:" + ((stay*room_rent)+(room_rent * 20/100)));
			break;
			default: 
				
				System.out.println( "The Amount is:" + stay*room_rent);

				
		}
		
	}

}

