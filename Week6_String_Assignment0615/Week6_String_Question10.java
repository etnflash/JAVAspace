package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ������ ������ �Է��Ͻÿ�.(100�� ����, Ȧ���� ° �ܾ ���) : ");
		String [] a = scan.nextLine().split(" ");
		for (int i = 0 ; i< a.length; i+=2) {
			System.out.println(a[i] + " ");
		}
	}

}
