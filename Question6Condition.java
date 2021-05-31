package assignmetn0525condition;
import java.util.Scanner;
public class Question6Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Year?: ");
		int year = input.nextInt();
		
		if ( year % 400 == 0 ) {
			System.out.println("leap year");
		} else if ( year % 4 == 0 && year % 100 != 0) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}

}
