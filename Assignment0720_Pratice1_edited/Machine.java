package Assignment0720_Pratice1_edited;

import java.util.Scanner;

public class Machine {
	public static int cupCount = 1;
	public static void showData(int cupCount, int change)
	{
		Scanner scan = new Scanner(System.in);
		if ( change < 0 )
		{
			System.out.println("����� �����մϴ�(Ŀ�� ���ܿ� 200��)");
		}
		else
		{
			System.out.println("Ŀ�� " + cupCount + "�ܰ� �ܵ� " + change + "��");
		}


		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CoinIn ci = new CoinIn();

		do
		{
			System.out.print("������ �Է��ϼ���: ");
			ci.coin = scan.nextInt();

			while (true)
			{
				System.out.print("�� ���� ���ϼ���: ");
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
			ci.culc(cupCount);

			showData(cupCount, ci.change);
			
			System.out.print("�ٽ� �Է��Ͻðڽ��ϱ�?(stop: 'n' or 'N')");
			scan.nextLine();
			ci.conti = scan.nextLine();
			System.out.println();

		} while(!(ci.conti.equals("N") || ci.conti.equals("n")));
	}
}
