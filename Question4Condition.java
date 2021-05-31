package assignmetn0525condition;
import java.util.Scanner;
public class Question4Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("which month? ");
		int a = input.nextInt();
		
		switch ( a ) {
			case 1:
				System.out.println("31days");
				break;
			case 2:
				System.out.println("28days");
				break;
			case 3:
				System.out.println("31days");
				break;
			case 4:
				System.out.println("30days");
				break;
			case 5:
				System.out.println("31days");
				break;
			case 6:
				System.out.println("30days");
				break;
			case 7:
				System.out.println("31days");
				break;
			case 8:
				System.out.println("31days");
				break;
			case 9:
				System.out.println("30days");
				break;
			case 10:
				System.out.println("31days");
				break;
			case 11:
				System.out.println("30days");
				break;
			case 12:
				System.out.println("31days");
				break;
			default:
				System.out.println("error");
				break;
		}
	}

}
