package assignmetn0525condition;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Male or Female? Write M or F: ");
		String a = input.nextLine();
		System.out.println("Age? (0~)");
		int b = input.nextInt();

		
		switch ( a ) {
			case "M":
				if ( b >= 18 ) {
					System.out.println("Man");
				} else if ( b < 18 && b >= 0 ) {
					System.out.println("Boy");
				} else {
					System.out.println("error : wrong age");
				}
				break;

			case "F":
				if ( b >= 18 ) {
					System.out.println("Woman");
				} else if ( b < 18 && b >= 0){
					System.out.println("Girl");
				} else {
					System.out.println("error : wrong age");
				}
				break;
			default :
				System.out.println("error : wrong gender");
				if ( b < 0 ) {
					System.out.println("error : wrong age");
				}
				break;

	}
	}
}

		
