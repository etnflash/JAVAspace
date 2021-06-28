package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("열 개의 문자를 입력하시오: ");
		String [] a = new String[10];
		for (int i = 0 ; i < 10; i++) {
			a[i] = scan.next();
		}
			System.out.print(a[0] + " " + a[3] + " " + a[6]);
	}

}
