package assignment0601;
import java.util.Scanner;
public class Week4Loop_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한 개의 자연수를 입력하시오 : ");
		
		int a = scan.nextInt();
		
		for (int i = 1 ; i <= 10 ; i++) {
			int c = a * i;
			System.out.print(c + " ");
		}
//		System.out.println(a + " " + a*2 + " " + a*3 +" " + a*4 +" " + a*5 + " " + a*6 +" "+ a*7 +" " + a*8 + " " + a*9 + " " + a*10 );
	}

}
