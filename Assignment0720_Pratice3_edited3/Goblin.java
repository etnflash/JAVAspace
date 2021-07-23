package Assignment0720_Pratice3_edited3;

public class Goblin extends Unit{
	int damage;			// 데미지 추가
	String attack_type = "";	// 공격타입 새로 추가
	
	//생성자 오버로딩
	//
	Goblin () 
	{
		String rank = "병사";
		int life = 100;
		String size = "small";
	}
	
	Goblin (String rank, String size, int life)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
	}
	
	// 공격타입 추가 설정 가능
	Goblin (String rank, String size, int life, String attack_type)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
		this.attack_type = attack_type;
	}
	
	// 데미지 추가 설정 가능
	Goblin (String rank, String size, int life, String attack_type, int damage)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
		this.attack_type = attack_type;
		this.damage = damage;
	}
	
	
		
	void show_status() 
	{
		System.out.println();
//		super.show_status();
		System.out.println("이름: " + this.getClass().getSimpleName());
		System.out.println("등급: " + this.rank);
		System.out.println("사이즈: " + this.size);
		System.out.println("라이프: " + this.life);
		System.out.println("공격타입: " + this.attack_type);
		System.out.println("데미지: " + this.damage);
	}
	
}
