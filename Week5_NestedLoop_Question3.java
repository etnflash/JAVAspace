package assignment0608;
import java.util.Scanner;
public class Week5_NestedLoop_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է��Ͻÿ�.: ");
		int a = scan.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ�.: ");
		int b = scan.nextInt();
		
		for (int i = 1; i <= a ; i++) {
			for (int j = 1; j <= b ; j++) {
				System.out.print(i*j+" ");
			} System.out.println("");
		}
	}

}
