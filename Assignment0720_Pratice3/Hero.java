package Assignment0720_Pratice3;

public class Hero extends Unit{
	
	int NUM = 100;
	Unit [] u = new SphereGoblin[NUM];
	Goblin goblin_1 = new Goblin("����", "small", 100, "��������", 15);
	Goblin goblin_2 = new Goblin("����", "small", 100, "��������", 15);
	SphereGoblin sphere_goblin_1 = new SphereGoblin("����", "small", 100, "������ ����", 10, "�� â");
	
	u[0] = goblin_1;
	u[1] = goblin_2;
	u[2] = sphere_goblin_1;
	
	Hero hero_1 = new Hero("����", "big", 300, u);

	Hero () {
		String rank = "����";
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
		System.out.printf("���� ������ ������ ����� %d��, â ����� %d���Դϴ�.",  );
	}
	
	void make_goblins_attack()
	{
		System.out.println("["+goblin_1.getClass().getSimpleName()+"]"+"�� �����մϴ�!" + "���� ������("+goblin_1.damage+")");
		System.out.println("["+goblin_2.getClass().getSimpleName()+"]"+"�� �����մϴ�!" + "���� ������("+goblin_2.damage+")");
		System.out.println("["+sphere_goblin_1.getClass().getSimpleName()+"]"+"�� �����մϴ�!" + "���� ������("+sphere_goblin_1.damage+")");
	}
	
	void add_goblins()
	{
		
	}
	
	void remove_goblins()
	{
		
	}
}
