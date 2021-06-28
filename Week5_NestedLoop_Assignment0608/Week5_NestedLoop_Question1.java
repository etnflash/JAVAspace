package Week5_NestedLoop_Assignment0608;
import java.util.Scanner;
public class Week5_NestedLoop_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("자연수 n을 입력하시오.: ");
		int a = scan.nextInt();
		int sum = 0;
		int cnt = 0;

		for ( int odd = 1 ; sum < a ; odd+=2) {
			sum += odd;
			cnt++;
		}
		System.out.println(cnt + "   " + sum);

	}

}
