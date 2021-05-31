package assignmetn0525;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = a++*--b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

//		a++;
//		--b;
//		System.out.println(a); // 11
//		System.out.println(b); // 19
//		System.out.println(a*b);

//		System.out.println(a++); // a = 10 b = 20
//		System.out.println(--b); // 10 19 209
//		System.out.println(a*b);
	}

}
