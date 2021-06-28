package Week5_NestedLoop_Assignment0608;
import java.util.Scanner;
public class Week5_NestedLoop_Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("줄의 수를 입력하시오.: ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i ; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j < 2*(n-i); j++) {
				System.out.print("*");
			} System.out.println("");
		}
	}

}
