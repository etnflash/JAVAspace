package Assignment0720_Pratice3_edited3;
import java.util.ArrayList;
import java.util.LinkedList;
public class Hero extends Unit{

	ArrayList <Goblin> ownUnitGob = new ArrayList<>();		//고블린만 담는 배열리스트
	ArrayList <SphereGoblin> ownUnitSph = new ArrayList<>();	//창고블린만 담는 배열리스트

	ArrayList <Unit> currentUnit = new ArrayList<>();		//현재 소유한 모든 유닛담는 배열리스트
	ArrayList <Unit> removedUnit = new ArrayList<>();		//제거된 유닛 담는 배열리스트





	// 히어로 생성자 중복정의
	// 히어로 기본 속성		//랭크 , 라이프, 사이즈는 유닛 클래스에서 상속받았음.
	Hero () {
		String rank = "영웅";
		life = 300;
		String size = "big";
	}

	// 히어로 속성 설정가능
	Hero (String rank, String size, int life)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
	}

	// 히어로 속성 설정 가능 및, 할당받은 유닛들(main에 allUnitList를 인수로 받음) 소유하게끔
	Hero (String rank, String size, int life, ArrayList ownUnit)
	{
		this.rank = rank;
		this.life = life;
		this.size = size;
		for(int i = 0 ; i < ownUnit.size(); i++)
		{
			//일단 모든 요소들은 currentUnit에 담아줌, 총 소유 명 수 파악 가능, 혹은 추가적인 기능....가능하지않을까.
			currentUnit.add((Unit) ownUnit.get(i));
			//고블린 객체를 가지고 있지만 창고블린 객체를 가지고 있는지 여부
			if (ownUnit.get(i) instanceof Goblin && !(ownUnit.get(i) instanceof SphereGoblin))
				ownUnitGob.add((Goblin) ownUnit.get(i));
			// 창고블린 객체를 가지고 있는지 여부
			else if (ownUnit.get(i) instanceof SphereGoblin)
				ownUnitSph.add((SphereGoblin) ownUnit.get(i));
			//여부 판단후 ownUnitGob 와 ownUnitSph에 따로 담음
		}
	}

	//가지고 있는 유닛목록
	void show_own_goblins()
	{
		System.out.printf("현재 영웅이 소유한 고블린은 %d명, 창 고블린은 %d명입니다.\n", ownUnitGob.size(), ownUnitSph.size());
		System.out.printf("총 %d명입니다.", currentUnit.size());
		System.out.println();
		System.out.println();
	}

	// 공격하게끔
	void make_goblins_attack()
	{
		for(int i = 0; i < currentUnit.size(); i++)
		{
			System.out.println("attack() 호출 : "+"["+currentUnit.get(i).getClass().getSimpleName()+"]"+"이 공격합니다!" + "상대방 데미지("+((Goblin)currentUnit.get(i)).damage+")");

		}
		System.out.println();
	}

	// add 고블린 메서드 메서드 두 개로 중복정의, 하나는 파라미터가 고블린 객체, 다른 하나는 파라미터가 창고블린 객체
	void add_goblins(Goblin gob)
	{
		if (ownUnitGob.contains(gob))
		{
			System.out.println("이미 추가된 고블린입니다. (error)");
			System.out.println();
		}
		else
		{
			System.out.println("고블린이 추가되었습니다.");
			currentUnit.add(gob);
			ownUnitGob.add(gob);
			System.out.println();
		}
	}

	void add_goblins(SphereGoblin sph)
	{
		if(ownUnitSph.contains(sph))
		{
			System.out.println("이미 추가된 창 고블린입니다. (error)");
			System.out.println();
		}
		else
		{
			System.out.println("창 고블린이 추가되었습니다.");
			currentUnit.add(sph);
			ownUnitSph.add(sph);
			System.out.println();
		}
	}

	// remove 고블린 메서드 두 개로 중복정의, 하나는 파라미터가 고블린 객체, 다른 하나는 파라미터가 창고블린 객체
	void remove_goblins(Goblin gob)
	{
		if (removedUnit.contains(gob))     //이미 제거된 적 있는 지 없는지.
		{
			System.out.println("이미 제거된 유닛입니다.");
		}
		if (!(ownUnitGob.contains(gob)))  //현재 소유하고 있는 고블린인지 아닌지
		{
			System.out.println("소유하고 있지 않은 고블린입니다. (error)");
			System.out.println();
		}
		else 
		{
			System.out.println("고블린이 제거되었습니다.");
			currentUnit.remove(gob);	//현재 모든 소유목록에서 제거
			ownUnitGob.remove(gob);		//현재 가진 고블린 목록에서 제거
			removedUnit.add(gob);		//제거된 유닛 목록에 추가
			System.out.println();
		}
	}

	void remove_goblins(SphereGoblin sph)
	{
		if (removedUnit.contains(sph))	//이미 제거된 적 있는지 없는지.
		{
			System.out.println("이미 제거된 유닛입니다.");
		}
		if (!(ownUnitSph.contains(sph)))	// 현재 소유하고 있는 창고블린인지 아닌지
		{
			System.out.println("소유하고 있지 않은 창 고블린입니다. (error)");
			System.out.println();
		}
		else 
		{
			System.out.println("창 고블린이 제거되었습니다.");
			currentUnit.remove(sph);	//현재 모든 소유목록에서 제거
			ownUnitSph.remove(sph);		//현재 가진 창고블린 목록에서 제거
			removedUnit.add(sph);		//제거된 유닛 목록에 추가
			System.out.println();
		}
	}

	//상태속성 출력
	void show_status() 
	{
		//		super.show_status();
		System.out.println("이름: " + this.getClass().getSimpleName());
		System.out.println("등급: " + this.rank);
		System.out.println("사이즈: " + this.size);
		System.out.println("라이프: " + this.life);
		System.out.println();
	}


	//생존 제거 할당 안됨 상태 파악
	void status(Goblin u) {
		if (currentUnit.contains(u))
		{
			this.status = "생존";
		}
		else if (removedUnit.contains(u))
		{
			this.status = "제거";
		}
		else
		{
			this.status = "할당되지 않음";
		}
		System.out.println("생존 상태: " +this.status);
	}

	public static void main(String[] args)
	{
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
		hero_1.status(goblin_1);	// hero_1에 할당된 goblin_1 생존해있음  // 생존상태 추가해봄

		sphere_goblin_2.show_status();
		hero_1.status(sphere_goblin_2);		// hero_1에 할당된 sphere_goblin_2 제거됨  //생존상태 추가해봄

		goblin_5.show_status();
		hero_1.status(goblin_5);		// hero_1에 할당된적 없음   //생존상태 추가해봄
	}
}
