package assignmetn0525;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("민수의 키를 입력하시오: ");
		double mH = input.nextDouble();
		System.out.print("민수의 몸무게를 입력하시오: ");
		double mW = input.nextDouble();
		System.out.print("기영이의 키를 입력하시오: ");
		double kH = input.nextDouble();
		System.out.print("기영이의 몸무게를 입력하시오: ");
		double kW = input.nextDouble();
		
		if (mH > kH && mW > kW) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
	}

}
