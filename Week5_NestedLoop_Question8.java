package assignment0608;

import java.util.Scanner;

public class Week5_NestedLoop_Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("자연수 n을 입력하시오(n은 행과 열의 갯수): ");
		int n = scan.nextInt();
		int a = 0;
		int b = n;
		int sum = 0;
		for (int j = 1; j <= n ; j++ ) {
			for (int k = 1 ; k < j ; k++) {
				System.out.print("  ");
			}
			for (int i = 1 ; i <= n-j+1; i++) {
			System.out.print(i + sum  + " ");
			} System.out.println("");
			sum += b--;
		}
	}
}