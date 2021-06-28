package Week2_Basic_Assignment0518;
import java.util.Scanner;
public class Week2Basic_Question5 {
	public static void main(String args[]) { 
 		Scanner input = new Scanner(System.in); 
 		 
 		System.out.print("yard? "); 
 		double yard = input.nextDouble(); 
 		 
 		double cm = yard*91.44; 
 		int cm100 = (int)(cm*100);
 		int cm100Remainder10 = cm100%10;
 		int quotient = cm100Remainder10/5;
 		int quotient10 = quotient*10;
 		int cm100Quo10 = cm100+quotient10; 
 		int cm100Quo10Div10 = cm100Quo10/10;
 		double cmF = (double)cm100Quo10Div10/10;
 		 
 		System.out.println(yard+"yard"+" = "+cmF+"cm"); 
// 		System.out.println(cm100);
// 		System.out.println(cm100Remainder10);
// 		System.out.println(quotient);
// 		System.out.println(quotient10);
// 		System.out.println(cm100Quo10);
// 		System.out.println(cm100Quo10Div10);
// 		System.out.println(cmF);
 	} 
 } 

