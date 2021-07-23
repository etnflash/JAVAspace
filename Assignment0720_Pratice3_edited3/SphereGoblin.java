package Assignment0720_Pratice3_edited3;

public class SphereGoblin extends Goblin {
	String sphere_type = "";	// 스피어 타입 새로 추가
	
	//생성자 오버로딩
	//
	SphereGoblin ()
	{
		String rank = "병사";
		int life = 100;
		String size = "small";
	}
	
	SphereGoblin (String rank, int life, String size, String attack_type)
	{
		this.rank = rank;
		this.life = life;
		this.size = size;
		this.attack_type = attack_type;
	}
	
	SphereGoblin (String rank, String size, int life, String attack_type, int damage, String sphere_type)
	{
		this(rank, life, size, attack_type);
		this.damage = damage;
		this.sphere_type = sphere_type;
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
		System.out.println("창 타입: " + this.sphere_type);
		
	}
}
