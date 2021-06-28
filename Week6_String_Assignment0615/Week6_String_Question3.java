package Week6_String_Assignment0615;

import java.util.Scanner;

public class Week6_String_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하시오. : ");
		String a = scan.nextLine();
		System.out.print("정수를 입력하시오(입력한 수 만큼 문자열 뒤 부터 출력). : ");
		int b = scan.nextInt();
		char [] charArr = a.toCharArray();
		for ( int i = a.length() ; i >a.length()-b ; i--) {
			System.out.print(charArr[i-1]);
		}
	}

}
