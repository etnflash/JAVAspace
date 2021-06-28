package Week5_NestedLoop_Assignment0608;
import java.util.Scanner;
public class Week5_NestedLoop_Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("줄의 수를 입력하시오.: ");
		int a = scan.nextInt();
		
		for (int i = 1; i <= a ;i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}

}
