package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("20�� ������ ���ڷ� �� 10���� �ܾ �Է��Ͻÿ�");
		String [] a = new String [10];
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print((i+1) + " : ");
			a[i] = scan.nextLine();
		}
		System.out.print("�� ���� ���ڸ� �Է��Ͻÿ� : ");
		char b = scan.nextLine().charAt(0);
		
		for (int k = 0 ; k < 10; k++) {
			if (a[k].endsWith(Character.toString(b)) == true) {
			System.out.println(a[k]);
			}
		}
	}
}
