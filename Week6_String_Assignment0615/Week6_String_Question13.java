package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ������ ���ڿ��� �Է��Ͻÿ� ( �Է� ������ �ݴ�� ��� )");
		System.out.print(": ");
		String a = scan.nextLine();
		String [] b = a.split(" ");
		for (int i = b.length-1; i >= 0 ; i--) {
			System.out.println(b[i]);
		}
		
	}

}
