package assignment0518;
import java.util.Scanner;
public class question5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("yard? ");
		double yard = input.nextDouble();
		
		double cm = yard*91.44;
 		int cm100 = (int)(cm*100);
 		int cm100remainder5 = cm100%5;
 		int quotient = cm100remainder5/5;
 		int quotient10 = quotient*10;
 		int cm100quo10 = cm100+quotient10; 
 		int cm100quo10div10 = cm100quo10/10;
 		double cmF = (double)cm100quo10div10/10;
 		 
 		System.out.println(yard+"yard"+" = "+cmF+"cm"); 
// 		System.out.println(cm100);
// 		System.out.println(cm100remainder5);
// 		System.out.println(quotient);
// 		System.out.println(quotient10);
// 		System.out.println(cm100quo10);
// 		System.out.println(cm100quo10div10);
// 		System.out.println(cmF);
	}
}
