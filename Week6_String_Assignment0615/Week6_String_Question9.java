package Week6_String_Assignment0615;
import java.util.Scanner;
public class Week6_String_Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("길이 30이하의 다섯 개의 단어를 입력하시오");
		String [] a = new String [5];
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1) +" : ");
			 a[i] = scan.nextLine();
		}
		for (int j = 4 ; j >= 0 ; j--) {
			System.out.println(a[j]);
		}
	}

}
