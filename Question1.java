package assignmetn0525condition;
import java.util.Scanner;
public class Question1 {

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
