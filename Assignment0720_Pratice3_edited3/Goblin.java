package Assignment0720_Pratice3_edited3;

public class Goblin extends Unit{
	int damage;			// ������ �߰�
	String attack_type = "";	// ����Ÿ�� ���� �߰�
	
	//������ �����ε�
	//
	Goblin () 
	{
		String rank = "����";
		int life = 100;
		String size = "small";
	}
	
	Goblin (String rank, String size, int life)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
	}
	
	// ����Ÿ�� �߰� ���� ����
	Goblin (String rank, String size, int life, String attack_type)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
		this.attack_type = attack_type;
	}
	
	// ������ �߰� ���� ����
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
		System.out.println("�̸�: " + this.getClass().getSimpleName());
		System.out.println("���: " + this.rank);
		System.out.println("������: " + this.size);
		System.out.println("������: " + this.life);
		System.out.println("����Ÿ��: " + this.attack_type);
		System.out.println("������: " + this.damage);
	}
	
}
