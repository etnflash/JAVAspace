package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int oddSum = 0;
		int evenSum = 0;
		int [] a = new int [10];
		System.out.println("10���� ������ �Է��Ͻÿ�");
		for ( int i = 0 ; i < 10 ; i++ ) {
			System.out.print(": ");
			a [i] = scan.nextInt();
		}
		for ( int j = 1 ; j < 10 ; j+=2 ) {
			evenSum += a[j];
		}
		for ( int k = 0 ; k < 10 ; k+=2 ) {
			oddSum += a[k];
		}
		double oddAvg = oddSum / 5.0;
		System.out.print("¦�� ��° �Էµ� ���� �� : ");
		System.out.println(evenSum);
		System.out.print("Ȧ�� ��° �Էµ� ���� ��� : ");
		System.out.printf("%.1f\n", oddAvg);
	}

}
