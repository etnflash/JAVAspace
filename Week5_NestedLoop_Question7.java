package assignment0608;
import java.util.Scanner;
public class Week5_NestedLoop_Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("자연수를 입력하시오: ");
		int a = scan.nextInt();
		
		for ( int i = 1; i <= a ; i++) {
			for ( int j = 1; j <= a-i; j++ ) {
				System.out.print("  ");
			}
			for (int k = 1 ; k <= i ; k++) {
			System.out.print(k + " ");
			} System.out.println();
		}
	}

}
