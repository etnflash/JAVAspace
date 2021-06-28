package Week3_Condition_Assignmetn0525;
import java.util.Scanner;
public class Week3_Condition_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write integer : ");
		int a = input.nextInt();
		
		if ( a == 0) {
			System.out.println("Zero");
		} else if ( a > 0 ) {
			System.out.println("Plus");
		} else {
			System.out.println("Minus");
		}
	}

}
