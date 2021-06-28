package Week5_NestedLoop_Assignment0608;
import java.util.Scanner;
public class Week5_NestedLoop_Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("1~100까지의 정수는 하나를 입력하시오: ");
		int a = scan.nextInt();
		int mul = 0;
		
		for ( int i = 1; mul < 100; i++ ) {
			mul = a * i ;
			if ( mul > 100 )
				break;
			
			System.out.print(mul + " ");

			if ( mul % 10 == 0) 
				break;

			}
		}
		
	}


