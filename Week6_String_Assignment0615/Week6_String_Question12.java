package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("20�� ������ �� ���� �ܾ �Է��Ͻÿ�");
		System.out.print("1 : ");
		String a = scan.nextLine();
		System.out.print("2 : ");
		String b = scan.nextLine();
		String c = "";
		String d = "";
		for (int i = 0 ; i < 2 ; i++) {
			c += a.charAt(i);
			d = c;
		}
		for (int j = 2 ; j < b.length() ; j++) {
			c += b.charAt(j);
		}
		System.out.println(c.concat(d));
	}

}
