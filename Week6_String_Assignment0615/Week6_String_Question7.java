package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("100개 이하의 문자열을 입력하시오 : ");
		
		String a = scan.nextLine().toLowerCase();
		char [] b = a.toCharArray();
		for(int i = 0 ; i < a.length() ; i++) {
			if (!(((int)a.charAt(i) >= 97 && (int)a.charAt(i) <= 122)
					|| ((int)a.charAt(i) >= 65 && (int)a.charAt(i) <= 90)
					|| ((int)a.charAt(i) >= 48 && (int)a.charAt(i) <= 57))) {
				continue;
			} System.out.print(a.charAt(i));
			
		}
		
	}

}
