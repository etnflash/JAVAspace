package Assignment0720_Pratice3;

public class Hero extends Unit{
	
	int NUM = 100;
	Unit [] u = new SphereGoblin[NUM];
	Goblin goblin_1 = new Goblin("병사", "small", 100, "근접공격", 15);
	Goblin goblin_2 = new Goblin("병사", "small", 100, "근접공격", 15);
	SphereGoblin sphere_goblin_1 = new SphereGoblin("병사", "small", 100, "레인지 공격", 10, "긴 창");
	
	u[0] = goblin_1;
	u[1] = goblin_2;
	u[2] = sphere_goblin_1;
	
	Hero hero_1 = new Hero("영웅", "big", 300, u);

	Hero () {
		String rank = "영웅";
		int life = 300;
		String size = "big";
	}
	
	Hero (String rank, String size, int life)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
	}
	
	Hero (String rank, String size, int life, Unit[] u)
	{
		this.rank = rank;
		this.life = life;
		this.size = size;
		
	}
	
	void show_own_goblins()
	{
		System.out.printf("현재 영웅이 소유한 고블린은 %d명, 창 고블린은 %d명입니다.",  );
	}
	
	void make_goblins_attack()
	{
		System.out.println("["+goblin_1.getClass().getSimpleName()+"]"+"이 공격합니다!" + "상대방 데미지("+goblin_1.damage+")");
		System.out.println("["+goblin_2.getClass().getSimpleName()+"]"+"이 공격합니다!" + "상대방 데미지("+goblin_2.damage+")");
		System.out.println("["+sphere_goblin_1.getClass().getSimpleName()+"]"+"이 공격합니다!" + "상대방 데미지("+sphere_goblin_1.damage+")");
	}
	
	void add_goblins()
	{
		
	}
	
	void remove_goblins()
	{
		
	}
}
