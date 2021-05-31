package assignmetn0525;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하시오 ( true는 1, false는 2 ): ");
		int a = input.nextInt();
		int b = input.nextInt();
		boolean b1 = a > b;
		boolean b2 = a < b;
		boolean b3 = a >= b;
		boolean b4 = a <= b;
		
		System.out.printf("%s > %s --- ", a, b);
		if ( b1 == false ) {
			System.out.println(0);
		} else if ( b1 == true) {
			System.out.println(1);
		}
		System.out.printf("%s < %s --- ", a, b);
		if ( b2 == false ) {
			System.out.println(0);
		} else if ( b2 == true) {
			System.out.println(1);
		}
		System.out.printf("%s >= %s --- ", a, b);
		if ( b3 == false ) {
			System.out.println(0);
		} else if ( b3 == true) {
			System.out.println(1);
		}
		System.out.printf("%s <= %s --- ", a, b);
		if ( b4 == false ) {
			System.out.println(0);
		} else if ( b4 == true) {
			System.out.println(1);
		}
	}

}
