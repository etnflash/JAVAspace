package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double [] c = new double [] {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		System.out.println("두 개 의 반을 고르시오(1반에서 6반)");
		System.out.print("첫번 째 반 : ");
		int a = scan.nextInt();
		System.out.print("두번 째 반 : ");
		int b = scan.nextInt();
		
		System.out.print("두 반의 평균 점수의 합 : ");
		double sum = c[a-1] + c[b-1];
		System.out.println(Math.round(sum*10)/10.0);
		System.out.println();
		
		
	}

}
