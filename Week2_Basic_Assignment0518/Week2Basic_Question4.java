package Week2_Basic_Assignment0518;
import java.util.Scanner;
public class Week2Basic_Question4 {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int sum = a + b + c;
		int avg = sum / 3 ;
		
		System.out.println("sum ="+sum);
		System.out.println("avg ="+avg);
	}
}
