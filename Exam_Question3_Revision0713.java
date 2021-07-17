package MidtermExam;
import java.util.Random;
import java.util.Scanner;
public class Exam_Question3_Revision0713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int [] lotto = new int [7]; // 아래에서 for문으로 중복 되지 않는 7숫자 랜덤 생성
		int [] input = new int [7]; // 아래에서 사용자에게 중복 되지 않는 7숫자 입력 받음 
		int score[] = { 10, 10, 10, 10, 10, 10, 1 }; // 6번째 추첨 까지는 10점 주고 7번째 추첨은 보너스라 차별화
		int point = 0; //각 스코어 합산 하기위해 point를 0 으로 초기화 해둠.
		int rate[] = { 60, 51, 50, 40, 30};  //아래에서 for문으로 point 합계와 일치하는 인덱스 +1 이 등수임 
		          // 십의 자릿수는 일반번호의 갯수, 일의 자릿수는 보너스번호 갯수.
		
		for (int i = 0; i < 7; i++)
		{
			lotto[i] = (int)rand.nextInt(45)+1;
			for (int j = 0 ; j < i; j++)
			{
				if (lotto[i] == lotto[j])
				{
					i--;			// 중복일 경우 i--함으로써 중복된 인덱스의 숫자를 중복되지 않을때 까지 덧씌움
					break;			// i--후 break 함으로써 같은인덱스에 랜덤값 다시 받음
				}
			}
		}
		
		for (int i = 0; i < 7; i++)
		{
			if (i == 6)
				System.out.println(lotto[i] + "(보너스)");  // 마지막 인덱스 숫자가 보너스숫자이므로
			else
				System.out.print(lotto[i] + " ");
		}
		
		for (int i = 0; i < 6; i++)
		{	
			System.out.print((i+1) + " : ");
			input [i] = scan.nextInt();
			for (int j = 0; j < i; j++)
			{
				if (input[i] == input[j])		// 이미 입력 받았던 숫자랑 지금 입력 받은 숫자가 같은 경우
				{
					i--;						// 마찬가지로 같은 인덱스롣 다시 돌아가서 입력받으려고
					System.out.println("중복입니다. 다시 입력하세요.");
					break;
				}
			}
				
				for (int k = 0; k < 7; k++)
					if (input[i] == lotto[k])
					{
						point += score[k];		// k가 6이면 보너스 숫자라 1더해지고 나머지 인덱스는 10 더해짐. 
						//System.out.println(point);
					}
		}
		
		//System.out.println(point);
		
		for(int i = 0 ; i < 5; i++)
		{
			if (point == rate[i])
				System.out.println("축하합니다. " + (i+1)+ "등에 당첨되셨습니다.");
		}
		//switch문 쓰는 것 보다 등수별 포인트를 담는 rate 배열을 생성, 초기화 후에 for문을 돌려 일치하는 인덱스 +1로 등수 출력
		//하는 것이 코드가 짧음
		
		/*
		switch (point) 
		{
			case 60:
				System.out.println("축하합니다. 1등에 당첨되셨습니다.");
				break;
			case 51:
				System.out.println("축하합니다. 2등에 당첨되셨습니다.");
				break;
			case 50:
				System.out.println("축하합니다. 3등에 당첨되셨습니다.");
				break;
			case 40:
				System.out.println("축하합니다. 4등에 당첨되셨습니다.");
				break;
			case 30:
				System.out.println("축하합니다. 5등에 당첨되셨습니다.");
				break;
			default:
				System.out.println("꽝입니다.");
				break;
		}
		*/
			
	}

}
