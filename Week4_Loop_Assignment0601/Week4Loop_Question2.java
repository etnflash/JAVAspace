package Week4_Loop_Assignment0601;
import java.util.Scanner;
public class Week4Loop_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("100 ������ ���� ������ �Է��Ͻÿ�: ");
		int a = scan.nextInt();
		int sum = 0;
		int i = 0;
		
		while ( a <= 100 ) {
			sum = sum + a++;
		} System.out.println(sum);
	}

}
