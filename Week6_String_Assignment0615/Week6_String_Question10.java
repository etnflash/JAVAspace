package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("공백을 포함한 문장을 입력하시오.(100자 이하, 홀수번 째 단어만 출력) : ");
		String [] a = scan.nextLine().split(" ");
		for (int i = 0 ; i< a.length; i+=2) {
			System.out.println(a[i] + " ");
		}
	}

}
