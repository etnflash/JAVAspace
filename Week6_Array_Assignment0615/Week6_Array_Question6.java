package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] a = new int [10];
		System.out.println("10���� ������ �Է��Ͻÿ� : ");
		for( int i = 0 ; i < 10 ; i++ ) {
			a [i] = scan.nextInt();
		}
		int compa = 1001;
		for( int j = 0 ; j < 10 ; j++) {
				if (compa > a [j] ) {
					compa = a [j];
				}					
		}
		System.out.print("�ּڰ��� : ");
		System.out.println(compa);
	}

}
