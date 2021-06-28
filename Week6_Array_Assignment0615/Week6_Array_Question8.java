package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [][] a = new int [2][4];
		int [][] b = new int [2][4];
		int [][] c = new int [2][4];
		String [][] d = new String [2][4]; 
		System.out.println("First Array");
		for (int i = 0 ; i < 2 ; i++) {
			for ( int j = 0 ; j < 4; j++) {
				d [i][j] = scan.next();
				a [i][j] = Integer.parseInt(d[i][j]);
			}
		}
		System.out.println("Second Array");
		for (int k = 0 ; k < 2 ; k++) {
			for (int l = 0 ; l < 4 ; l++) {
				d [k][l] = scan.next();
				b [k][l] = Integer.parseInt(d[k][l]);
			}
		}
		for (int m = 0 ; m < 2 ; m++) {
			for (int n = 0 ; n < 4 ; n++) {
				c [m][n] = a[m][n] * b[m][n];
				System.out.print(c[m][n] + " ");
			}System.out.println("");
		}
		
	}

}
