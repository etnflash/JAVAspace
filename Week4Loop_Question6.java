package assignment0601;
import java.util.Scanner;
public class Week4Loop_Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String c;
		do
		{	
			System.out.println("Triangle Width? ");
			System.out.print("base? ");
			double base = scan.nextDouble();
			System.out.print("height? ");
			double height = scan.nextDouble();

			System.out.printf("%.1f\n", base*height/2);

			System.out.print("continue? ");
			c = scan.nextLine();
			c = scan.nextLine();
	} while ( c.equals("y") || c.equals("Y"));

}
}
