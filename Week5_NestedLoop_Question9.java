package assignment0608;
import java.util.Scanner;
import java.util.Random;
public class Week5_NestedLoop_Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		Scanner scan = new Scanner(System.in);
		System.out.println("행과 열의 수를 입력하시오.(n x n): ");
		int n = scan.nextInt();
		int [] a = new int [n*n];
		for (int k = 0 ; k <= n * n-1; k++) {
			a [k] = ((int) (Math.random()*5+1))*2-1;
		}
		
		for (int i = 0 ; i < n ; i++) {
			for ( int j = 0 ; j < n ; j++) {
				System.out.print(a[n*i+j] + " ");
				} System.out.println();

		}
}
}