package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("여섯 명의 몸무게를 입력하시오");
		double sum = 0;
		double avg = sum / 6;
		double [] a = new double[6]; 
		for(int i=0 ; i<6 ; i++) {
			System.out.print(": ");
			a[i] = scan.nextDouble();
			sum += a[i];
			avg = sum / 6.;
		}
		System.out.print("평균 : ");
		System.out.printf("%.1f", avg);
	}

}
