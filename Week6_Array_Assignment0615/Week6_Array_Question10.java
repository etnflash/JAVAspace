package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("4�� 2���� ���ڹ迭�� �Է��Ͻÿ�. : ");
		int [][] a = new int [4][2];
		int [] rowSum = new int [4];
		int [] colSum = new int [2];
		int totSum = 0;
				
		for(int i = 0 ; i < 4 ; i++ ) {
			for(int j = 0 ; j < 2 ; j++ ) {
				a[i][j] = Integer.parseInt(scan.next());
				rowSum [i] += a[i][j] / 2;
				colSum [j] += a[i][j] / 4;
				totSum += a[i][j];
			}
		}
		System.out.print("������� : ");
		for (int k = 0 ; k < 4 ; k++) {
			System.out.print(rowSum[k] + " ");
		} System.out.println("");
		System.out.print("������� : ");
		for ( int l = 0 ; l < 2 ; l++) {
			System.out.print(colSum[l] + " ");
		} System.out.println("");
		System.out.print("��ü��� : ");
		System.out.println(totSum/8);
	}

}
