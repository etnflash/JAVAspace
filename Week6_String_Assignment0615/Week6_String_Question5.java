package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하시오. (문자 수 만큼 오른쪽으로 한 바퀴 회전하여 출력) : ");
		String a = scan.nextLine();
//		char [] charArr = a.toCharArray();
		for (int i = a.length() ; i > 0; i--) {
			for ( int j = 0; j < a.length(); j++ ) {
				int k = (i + j - 1) % a.length();
				System.out.print(a.charAt(k));
			} System.out.println("");
		}
	}

}
