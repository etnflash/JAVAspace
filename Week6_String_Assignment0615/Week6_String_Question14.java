package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� ���ڿ��� �Է��Ͻÿ�");
		System.out.print("1 : ");
		String a = scan.nextLine();
		System.out.print("2 : ");
		String b = scan.nextLine();
		System.out.print("���� n�� �Է��Ͻÿ� : ");
		int n = scan.nextInt();
		String ab = a.concat(b);
		System.out.println(ab);
		char [] d = ab.toCharArray();
		char [] e = b.toCharArray();
		int k = b.length();
		//ab.getChars(0, c, d, 0);
		String f = "";
			f = f.copyValueOf(d, 0, n );
		System.out.print(f);
		for ( int i = n ; i < b.length(); i++) {
			System.out.print(e[i]);
		}
	}

}
