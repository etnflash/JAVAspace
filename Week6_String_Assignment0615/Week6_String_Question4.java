package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("두 개의 문자열을 입력받아 두 문자열의 길이의 합을 출력한다.");
		System.out.print("첫 번째 문자열을 입력하시오. : ");
		String a = scan.nextLine();
		System.out.print("두 번째 문자열을 입력하시오. : ");
		String b = scan.nextLine();
		System.out.print("문자열 길이의 합 : ");
		System.out.println(a.length()+b.length());
	}

}
