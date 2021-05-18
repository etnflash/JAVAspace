package assignment0518;
import java.util.Scanner;
public class exam5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("yard? ");
		double yard = input.nextDouble();
		
		double cm = yard*91.44;
		double cm2 = cm;
		
		System.out.println(yard+"yard"+" = "+cm+"cm");
	}
}
