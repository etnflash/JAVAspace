package Assignment0720_Pratice3_edited3;

public class SphereGoblin extends Goblin {
	String sphere_type = "";	// ���Ǿ� Ÿ�� ���� �߰�
	
	//������ �����ε�
	//
	SphereGoblin ()
	{
		String rank = "����";
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
		System.out.println("�̸�: " + this.getClass().getSimpleName());
		System.out.println("���: " + this.rank);
		System.out.println("������: " + this.size);
		System.out.println("������: " + this.life);
		System.out.println("����Ÿ��: " + this.attack_type);
		System.out.println("������: " + this.damage);
		System.out.println("â Ÿ��: " + this.sphere_type);
		
	}
}
