package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double [] c = new double [] {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		System.out.println("�� �� �� ���� ���ÿ�(1�ݿ��� 6��)");
		System.out.print("ù�� ° �� : ");
		int a = scan.nextInt();
		System.out.print("�ι� ° �� : ");
		int b = scan.nextInt();
		
		System.out.print("�� ���� ��� ������ �� : ");
		double sum = c[a-1] + c[b-1];
		System.out.println(Math.round(sum*10)/10.0);
		System.out.println();
		
		
	}

}
