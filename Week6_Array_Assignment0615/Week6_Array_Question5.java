package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] intArr = new int [100];
		int stopIndex = 0;
		System.out.println("������ �Է��Ͻÿ� (0�� �Է��ϸ� ����): ");
		for(int i = 0 ; i < 100 ; i++) {
			intArr[i] = scan.nextInt();
			if (intArr[i] == 0) {
				stopIndex = i;
				break;
			}
		}
		if ( intArr[0] != 0) {
			for ( int j = stopIndex-1 ; j >= 0 ; j--) {
				System.out.print(intArr[j] + " ");
			
		}
	}
	}
}
