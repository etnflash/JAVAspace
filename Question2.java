package assignmetn0525;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력하시오: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a > b && a > c) {
			System.out.println(1);
		} else {
		System.out.println(0);
		}
		if ( a == b && b == c) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
