package assignment0601;

public class Week4Loop_Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int [5][5];
		
		for ( int i = 0 ; i < 5 ; i++) {
			for ( int j = 0; j < 5; j++ ) {
				a [i][j] = 2 + i + j;
				System.out.print(a[i][j] + " ");
			} 	System.out.println("");
		} 
	}

}
