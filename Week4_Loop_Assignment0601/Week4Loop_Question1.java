package Week4_Loop_Assignment0601;
import java.util.Scanner;
public class Week4Loop_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("100 ������ ���� ������ �Է��Ͻÿ�: ");
		int a = scan.nextInt();
		System.out.print("1���� �Է��� ���������� �հ�= ");
		

		int i = 1;
		int sum = 0;
		while ( i <= a) {
			sum = sum + i;
			i++;
		} System.out.println(sum);
	}

}
