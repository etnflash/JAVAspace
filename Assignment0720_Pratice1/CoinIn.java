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
			System.out.println("����� �����մϴ�(Ŀ�� ���ܿ� 200��)");
		}
		else if ( change >= 0 )
		{
			System.out.println("Ŀ�� " + cupCount + "�ܰ� �ܵ� " + change + "��");
		}

		System.out.print("�ٽ� �Է��Ͻðڽ��ϱ�?(stop: 'n' or 'N')");
		scan.nextLine();
		conti = scan.nextLine();
		System.out.println();
		
	}
	
	public CoinIn()
	{
		this.cofPrice = 200;
		
		

		do
		{
			System.out.print("������ �Է��ϼ���: ");
			coin = scan.nextInt();

			while (true)
			{
				System.out.println("�� ���� ���ϼ���: ");
				cupCount = scan.nextInt();
				if ( cupCount == 0) 
				{	
					System.out.println("can't divide with 0.");
					continue;
				} 
				else if ( cupCount <= 0)
				{
					System.out.println("������ �Է� �Ұ��Դϴ�.");
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
