package Week3_Condition_Assignmetn0525;
import java.util.Scanner;
public class Week3_Condition_Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Year?: ");
		int year = input.nextInt();
		
		  if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("leap year");
			} else {
				System.out.println("common year");
			}
		// °¡´É
//		if ( year % 400 == 0 ) {
//			System.out.println("leap year");
//		} else if ( year % 4 == 0 && year % 100 != 0) {
//			System.out.println("leap year");
//		} else {
//			System.out.println("common year");
//		}
	}

}
