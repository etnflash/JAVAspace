package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("5개 이상 100개 이하의 문자로 된 단어를 입력하시오.(앞에서 부터 5자 출력) : ");
		String a = scan.nextLine();
		System.out.println(a.substring(0,5));
	}

}
