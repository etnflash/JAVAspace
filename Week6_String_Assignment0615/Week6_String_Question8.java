package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("두 개의 단어를 입력하시오");
		System.out.print("첫 번째 : ");
		String a = scan.nextLine();
		System.out.print("두 번째 : ");
		String b = scan.nextLine();
		int c = a.length();
		int d = b.length();
		int e = Math.max(c, d);
		System.out.println(e);
		
	}
}
