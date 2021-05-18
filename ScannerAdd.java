import java.util.Scanner;
public class ScannerAdd {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		int a = input.nextInt();
		System.out.print("두번째 숫자를 입력하시오: ");
		int b = input.nextInt();
		System.out.println(a+b);
	}
}
