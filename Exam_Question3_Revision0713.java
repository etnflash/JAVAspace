package MidtermExam;
import java.util.Random;
import java.util.Scanner;
public class Exam_Question3_Revision0713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int [] lotto = new int [7]; // �Ʒ����� for������ �ߺ� ���� �ʴ� 7���� ���� ����
		int [] input = new int [7]; // �Ʒ����� ����ڿ��� �ߺ� ���� �ʴ� 7���� �Է� ���� 
		int score[] = { 10, 10, 10, 10, 10, 10, 1 }; // 6��° ��÷ ������ 10�� �ְ� 7��° ��÷�� ���ʽ��� ����ȭ
		int point = 0; //�� ���ھ� �ջ� �ϱ����� point�� 0 ���� �ʱ�ȭ �ص�.
		int rate[] = { 60, 51, 50, 40, 30};  //�Ʒ����� for������ point �հ�� ��ġ�ϴ� �ε��� +1 �� ����� 
		          // ���� �ڸ����� �Ϲݹ�ȣ�� ����, ���� �ڸ����� ���ʽ���ȣ ����.
		
		for (int i = 0; i < 7; i++)
		{
			lotto[i] = (int)rand.nextInt(45)+1;
			for (int j = 0 ; j < i; j++)
			{
				if (lotto[i] == lotto[j])
				{
					i--;			// �ߺ��� ��� i--�����ν� �ߺ��� �ε����� ���ڸ� �ߺ����� ������ ���� ������
					break;			// i--�� break �����ν� �����ε����� ������ �ٽ� ����
				}
			}
		}
		
		for (int i = 0; i < 7; i++)
		{
			if (i == 6)
				System.out.println(lotto[i] + "(���ʽ�)");  // ������ �ε��� ���ڰ� ���ʽ������̹Ƿ�
			else
				System.out.print(lotto[i] + " ");
		}
		
		for (int i = 0; i < 6; i++)
		{	
			System.out.print((i+1) + " : ");
			input [i] = scan.nextInt();
			for (int j = 0; j < i; j++)
			{
				if (input[i] == input[j])		// �̹� �Է� �޾Ҵ� ���ڶ� ���� �Է� ���� ���ڰ� ���� ���
				{
					i--;						// ���������� ���� �ε����� �ٽ� ���ư��� �Է¹�������
					System.out.println("�ߺ��Դϴ�. �ٽ� �Է��ϼ���.");
					break;
				}
			}
				
				for (int k = 0; k < 7; k++)
					if (input[i] == lotto[k])
					{
						point += score[k];		// k�� 6�̸� ���ʽ� ���ڶ� 1�������� ������ �ε����� 10 ������. 
						//System.out.println(point);
					}
		}
		
		//System.out.println(point);
		
		for(int i = 0 ; i < 5; i++)
		{
			if (point == rate[i])
				System.out.println("�����մϴ�. " + (i+1)+ "� ��÷�Ǽ̽��ϴ�.");
		}
		//switch�� ���� �� ���� ����� ����Ʈ�� ��� rate �迭�� ����, �ʱ�ȭ �Ŀ� for���� ���� ��ġ�ϴ� �ε��� +1�� ��� ���
		//�ϴ� ���� �ڵ尡 ª��
		
		/*
		switch (point) 
		{
			case 60:
				System.out.println("�����մϴ�. 1� ��÷�Ǽ̽��ϴ�.");
				break;
			case 51:
				System.out.println("�����մϴ�. 2� ��÷�Ǽ̽��ϴ�.");
				break;
			case 50:
				System.out.println("�����մϴ�. 3� ��÷�Ǽ̽��ϴ�.");
				break;
			case 40:
				System.out.println("�����մϴ�. 4� ��÷�Ǽ̽��ϴ�.");
				break;
			case 30:
				System.out.println("�����մϴ�. 5� ��÷�Ǽ̽��ϴ�.");
				break;
			default:
				System.out.println("���Դϴ�.");
				break;
		}
		*/
			
	}

}
