package Week6_String_Assignment0615;

import java.util.Scanner;

public class Week6_String_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�. : ");
		String a = scan.nextLine();
		System.out.print("������ �Է��Ͻÿ�(�Է��� �� ��ŭ ���ڿ� �� ���� ���). : ");
		int b = scan.nextInt();
		char [] charArr = a.toCharArray();
		for ( int i = a.length() ; i >a.length()-b ; i--) {
			System.out.print(charArr[i-1]);
		}
	}

}
