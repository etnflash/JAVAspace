package Week5_NestedLoop_Assignment0608;
import java.util.Scanner;
import java.lang.Math;
public class Week5_NestedLoop_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단을 몇 단 부터 몇 단 까지 출력하시길 바랍니까?(2~9단 중");
		System.out.println("(먼저 입력한 단 부터 순차적으로 출력됩니다)");
		System.out.print(": ");
		int a = scan.nextInt();
		System.out.print(": ");
		int b = scan.nextInt();
		int mult;
		int c = Math.abs(a - b);
		if (a < b) {
			for ( int i = 1 ; i <= 9; i++) {
				for ( int j = a ; j <= b ; j++ ) {
					mult = j * i;
					System.out.print(j + " * " + i + " = " );
					if ( mult < 10) {
						System.out.print(" ");
					}
					System.out.print(+ mult);
					System.out.print("   ");
				} System.out.println();
			}
		} else if ( a > b) {
			for ( int i = 1 ; i <= 9; i++) {
				for ( int j = a ; j >= b ; j-- ) {
					mult = j * i;
					System.out.print(j + " * " + i + " = " );
					if ( mult < 10) {
						System.out.print(" ");
					}
					System.out.print(+ mult);
					System.out.print("   ");
				} System.out.println();
//			for ( int i = 1 ; i <= 9; i++) {
//				mult = a * i;
//				System.out.print(a + " * " + i + " = " + mult
//						+ "   " + (a-1) + " * " + i + " = " + (mult-1) );
		}
			
		} else if ( a == b ) {
			for ( int i = 1 ; i <= 9; i++) {
				mult = a * i;
				System.out.print(a + " * " + i + " = ");
				if ( mult < 10) {
					System.out.print(" ");
				}
				System.out.print(+ mult);
				System.out.println("   ");
		}
		}
	}
	}


