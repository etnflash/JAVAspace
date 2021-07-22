package Assignment0720_Pratice1_edited;

import java.util.Scanner;

public class Machine {
	public static int cupCount = 1;
	public static void showData(int cupCount, int change)
	{
		Scanner scan = new Scanner(System.in);
		if ( change < 0 )
		{
			System.out.println("요금이 부족합니다(커피 한잔에 200원)");
		}
		else
		{
			System.out.println("커피 " + cupCount + "잔과 잔돈 " + change + "원");
		}


		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CoinIn ci = new CoinIn();

		do
		{
			System.out.print("동전을 입력하세요: ");
			ci.coin = scan.nextInt();

			while (true)
			{
				System.out.print("몇 잔을 원하세요: ");
				cupCount = scan.nextInt();
				if ( cupCount == 0) 
				{	
					System.out.println("can't divide with 0.");
					continue;
				} 
				else if ( cupCount <= 0)
				{
					System.out.println("음수는 입력 불가입니다.");
					continue;
				}
				else if ( cupCount >= 0)
				{
					break;
				}
			}
			ci.culc(cupCount);

			showData(cupCount, ci.change);
			
			System.out.print("다시 입력하시겠습니까?(stop: 'n' or 'N')");
			scan.nextLine();
			ci.conti = scan.nextLine();
			System.out.println();

		} while(!(ci.conti.equals("N") || ci.conti.equals("n")));
	}
}
