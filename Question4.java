package assignmetn0525;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�μ��� Ű�� �Է��Ͻÿ�: ");
		double mH = input.nextDouble();
		System.out.print("�μ��� �����Ը� �Է��Ͻÿ�: ");
		double mW = input.nextDouble();
		System.out.print("�⿵���� Ű�� �Է��Ͻÿ�: ");
		double kH = input.nextDouble();
		System.out.print("�⿵���� �����Ը� �Է��Ͻÿ�: ");
		double kW = input.nextDouble();
		
		if (mH > kH && mW > kW) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
	}

}
