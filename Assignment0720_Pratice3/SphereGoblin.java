package Assignment0720_Pratice3;

public class SphereGoblin extends Goblin {
	String sphere_type = "";
	
	SphereGoblin (String rank, int life, String size, String sphere_type)
	{
		this.rank = rank;
		this.life = life;
		this.size = size;
		this.sphere_type = sphere_type;
	}
	
	SphereGoblin (String rank, String size, int life, String attack_type, int damage, String sphere_type)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
		this.attack_type = attack_type;
		this.damage = damage;
		this.sphere_type = sphere_type;
	}
	
	void show_status() 
	{
		System.out.println("이름: " + this.getClass().getSimpleName());
		System.out.println("등급: " + this.rank);
		System.out.println("사이즈: " + this.size);
		System.out.println("라이프: " + this.life);
		System.out.println("공격타입: " + this.sphere_type);
		
		
	}
}
