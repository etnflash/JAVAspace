package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//switch
		//continue
		Scanner scan = new Scanner(System.in);
		int capacity = 100;
		int amount = 10;
		int [] a = new int [capacity];
		System.out.println("100미만의 정수를 계속 입력하시오 ( 0 입력 시 종료 )");
		int [] b = new int [10];
		for (int i = 0 ; i < capacity ; i++) {
			a[i] = scan.nextInt();
			if ( a[i] == 0 ) {
				break;
			}
			b[(int)(a[i]/10)]++;
			if (i == capacity-1) {
				capacity += amount;
			}
		}
		for (int j = 0 ; j < 10 ; j++) {
			if ( b[j] != 0) {
				System.out.println(j + " : " + b[j]);
			}
		}
		
	}

}
