package Week4_Loop_Assignment0601;
import java.util.Scanner;
public class Week4Loop_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("100 이하의 양의 정수를 입력하시오: ");
		int a = scan.nextInt();
		System.out.print("1부터 입력한 정수까지의 합계= ");
		

		int i = 1;
		int sum = 0;
		while ( i <= a) {
			sum = sum + i;
			i++;
		} System.out.println(sum);
	}

}
