package assignmetn0525condition;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Number? (1-dog, 2-cat, 3-chick) ");
		int a = input.nextInt();
		
		switch ( a ) {
			case 1:
				System.out.println("dog");
				break;
			case 2:
				System.out.println("cat");
				break;
			case 3:
				System.out.println("chick");
				break;
			default:
				System.out.println("I don't know.");
				break;
		}
		
		
	}

}
