package Week4_Loop_Assignment0601;
import java.util.Scanner;
public class Week4Loop_Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ������ �Է��Ͻÿ�. (0�� �Է��ϸ� ����)");
		int a;
		int i = 0;
		do {
			a = scan.nextInt();
			System.out.println(a);
			if ( a % 3 != 0 && a % 5 != 0) {
				i++;
			}
		} while ( a != 0 ) ;
		System.out.println(i);
	}	

}
