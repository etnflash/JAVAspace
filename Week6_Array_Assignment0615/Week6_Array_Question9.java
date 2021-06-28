package Week6_Array_Assignment0615;
import java.util.Scanner;
public class Week6_Array_Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String [][] a = new String [4][3];
		int [][] b = new int [4][3];
		int [] classSum = new int [4]; 
		for (int i = 0 ; i < 4 ; i++) {
			System.out.print((i+1)+"class? ");
			for (int j = 0 ; j < 3 ; j++) {
				b[i][j] = Integer.parseInt(scan.next());
				classSum[i] += b[i][j];
			} 
		}	System.out.println("");
		
		for (int k = 0 ; k < 4 ; k++) {
		System.out.println((k+1)+"class : " + classSum[k]);	
		}
	}

}
