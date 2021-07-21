package Assignment0720_Pratice3;

public class Goblin extends Unit{
	String attack_type = "";
	int damage;
	
	Goblin () 
	{
		String rank = "병사";
		int life = 100;
		String size = "small";
		damage = 10;
	}
	
	Goblin (String rank, String size, int life)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
	}
	
	Goblin (String rank, String size, int life, String attack_type)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
		this.attack_type = attack_type;
	}
	
	Goblin (String rank, String size, int life, String attack_type, int damage)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
		this.attack_type = attack_type;
		this.damage = damage;
	}
	
	void attack() 
	{
		
	}
	
	
		
	void show_status() 
	{
		System.out.println("이름: " + this.getClass().getSimpleName());
		System.out.println("등급: " + this.rank);
		System.out.println("사이즈: " + this.size);
		System.out.println("라이프: " + this.life);
		if (!attack_type.equals(""));
		System.out.println("공격타입: " + this.attack_type);
		
	}
	
}
