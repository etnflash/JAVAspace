package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� �ܾ �Է��Ͻÿ�");
		System.out.print("ù ��° : ");
		String a = scan.nextLine();
		System.out.print("�� ��° : ");
		String b = scan.nextLine();
		int c = a.length();
		int d = b.length();
		int e = Math.max(c, d);
		System.out.println(e);
		
	}
}
