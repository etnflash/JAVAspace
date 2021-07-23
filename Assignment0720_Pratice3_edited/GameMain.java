package Assignment0720_Pratice3_edited;
import java.util.*;
public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Unit> allUnitList = new ArrayList<>();  //생성된 고블린 중에 할당 안된 고블린 한번에 담기위해 
															//즉 add_goblins() 이용안할 때
		
		// 최초 유닛들 3명 생성 고블린 2, 창고블린 1
		Goblin goblin_1 = new Goblin("병사", "small", 100, "근접공격", 15);
		Goblin goblin_2 = new Goblin("병사", "small", 100, "근접공격", 15);
		SphereGoblin sphere_goblin_1 = new SphereGoblin("병사", "small", 100, "레인지 공격", 10, "긴 창");
		
		allUnitList.add(goblin_1);					// 생성시킨 고블린 1,2 그리고 창고블린 1을 allUnitList에 보관
		allUnitList.add(goblin_2);
		allUnitList.add(sphere_goblin_1);
		
		
		
		
		Hero hero_1 = new Hero("영웅", "big", 300, allUnitList); //allUnitList 에 [goblin_1, goblin_2, sphere_goblin_1]담겨있음
		
		hero_1.show_status(); 		//히어로 속성 출력
		hero_1.show_own_goblins();    // 고블린 2명, 창고블린 1명, 총 3명
		hero_1.make_goblins_attack(); //3명이서 공격
		
		//이미 할당시킨 유닛들은 allUnitList 에서 clear 시켜줌
		allUnitList.clear();
		
		// 새 유닛 생성, 할당은 임의로	// allUnitList에 보관 안하고 이번에는 밑에서 add_goblins() 메서드 이용해서 한명씩추가 할거임
		Goblin goblin_4 = new Goblin("병사", "small", 100, "근접공격", 20);  // goblin_4 새로 생성
		SphereGoblin sphere_goblin_2 = new SphereGoblin("병사", "small", 100, "레인지 공격", 5, "긴 창"); // sphere_goblin_2 새로 생성
		Goblin goblin_5 = new Goblin("병사", "small", 100, "근접공격", 20);  // goblin_5 새로 생성
		
			
		hero_1.add_goblins(goblin_4);  // 29번째 줄에서 생성한 거 할당 -> 고블린이 추가되었습니다. 메시지 출력
		hero_1.add_goblins(goblin_4);  // 같은 유닛 또 생성 -> 이미 추가된~ error 메세지 출력
		
		hero_1.show_own_goblins();	// 고블린 3명, 창고블린 1명, 총 4명
		
		hero_1.add_goblins(sphere_goblin_2); // 30번재줄에서 생성 해놓은 거 할당 -> 창고블린이 추가되었습니다. 메시지 출력
		hero_1.show_own_goblins();  // 고블린 3명, 창고블린 2명, 총 5명
		
		 // 5명이서 공격
		
		
		
		hero_1.remove_goblins(goblin_4);  // 유닛 제거
		hero_1.remove_goblins(goblin_4);  // 이미 제거된 유닛입니다, 소유하고 있지 않은~ error 메세지 둘다 출력
		
		hero_1.remove_goblins(sphere_goblin_2); // 유닛 제거
		
		hero_1.remove_goblins(goblin_5); //31번째에 생성만 하고 할당안 한 고블린 -> 소유하고 있지 않은 고블린입니다 메시지만 출력
		
		hero_1.show_own_goblins();	// 고블린 2명, 창고블린 1명, 총 3명
		hero_1.make_goblins_attack();  //3명이서 공격
		
		
		
		goblin_1.show_status();
		hero_1.status(goblin_1);	// hero_1에 할당된 goblin_1 생존해있음
		
		sphere_goblin_2.show_status();
		hero_1.status(sphere_goblin_2);		// hero_1에 할당된 sphere_goblin_2 제거됨
		
		goblin_5.show_status();
		hero_1.status(goblin_5);		// hero_1에 할당된적 없음
		
		
	}

}
