package assignmetn0525condition;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("A, B, C, D or F?");
		String a = input.nextLine();
		
		switch ( a ) {
			case "A":
				System.out.println("Excellent");
				break;
			case "B":
				System.out.println("Good");
				break;
			case "C":
				System.out.println("Usually");
				break;
			case "D":
				System.out.println("Effort");
				break;
			case "F":
				System.out.println("Failure");
				break;
			default:
				System.out.println("error");
				break;
				
		}
			
	}

}
