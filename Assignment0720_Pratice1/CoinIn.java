package Assignment0720_Pratice1;
import java.util.Scanner;
public class CoinIn {
	Scanner scan = new Scanner(System.in);
	public int coin = 0;
	public int change = 0;
	public int cofPrice = 0;
	public int cupCount = 0;
	public String conti = "";

	public void culc(int cupCount) 
	{
		change = coin - cofPrice * cupCount;
	}

	public void showData()
	{
		if ( change < 0 )
		{
			System.out.println("요금이 부족합니다(커피 한잔에 200원)");
		}
		else if ( change >= 0 )
		{
			System.out.println("커피 " + cupCount + "잔과 잔돈 " + change + "원");
		}

		System.out.print("다시 입력하시겠습니까?(stop: 'n' or 'N')");
		scan.nextLine();
		conti = scan.nextLine();
		System.out.println();
		
	}
	
	public CoinIn()
	{
		this.cofPrice = 200;
		
		

		do
		{
			System.out.print("동전을 입력하세요: ");
			coin = scan.nextInt();

			while (true)
			{
				System.out.println("몇 잔을 원하세요: ");
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
			this.culc(cupCount);

			this.showData();

		} while(!(conti.equals("N") || conti.equals("n")));

	}
}
