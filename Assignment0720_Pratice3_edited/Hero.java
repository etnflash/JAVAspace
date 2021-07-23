package Assignment0720_Pratice3_edited;
import java.util.ArrayList;
import java.util.LinkedList;
public class Hero extends Unit{
	
	ArrayList <Goblin> ownUnitGob = new ArrayList<>();		//����� ��� �迭����Ʈ
	ArrayList <SphereGoblin> ownUnitSph = new ArrayList<>();	//â����� ��� �迭����Ʈ
	
	ArrayList <Unit> currentUnit = new ArrayList<>();		//���� ������ ��� ���ִ�� �迭����Ʈ
	ArrayList <Unit> removedUnit = new ArrayList<>();		//���ŵ� ���� ��� �迭����Ʈ
	
	

	

	// ����� ������ �ߺ�����
	// ����� �⺻ �Ӽ�		//��ũ , ������, ������� ���� Ŭ�������� ��ӹ޾���.
	Hero () {
		String rank = "����";
		life = 300;
		String size = "big";
	}
	
	// ����� �Ӽ� ��������
	Hero (String rank, String size, int life)
	{
		this.rank = rank;
		this.size = size;
		this.life = life;
	}

	// ����� �Ӽ� ���� ���� ��, �Ҵ���� ���ֵ� �����ϰԲ�
	Hero (String rank, String size, int life, ArrayList ownUnit)
	{
		this.rank = rank;
		this.life = life;
		this.size = size;
		for(int i = 0 ; i < ownUnit.size(); i++)
		{
			//�ϴ� ��� ��ҵ��� currentUnit�� �����, �� ���� �� �� �ľ� ����, Ȥ�� �߰����� ���....��������������.
			currentUnit.add((Unit) ownUnit.get(i));
			 //��� ��ü�� ������ ������ â��� ��ü�� ������ �ִ��� ����
			if (ownUnit.get(i) instanceof Goblin && !(ownUnit.get(i) instanceof SphereGoblin))
				ownUnitGob.add((Goblin) ownUnit.get(i));
			// â��� ��ü�� ������ �ִ��� ����
			else if (ownUnit.get(i) instanceof SphereGoblin)
				ownUnitSph.add((SphereGoblin) ownUnit.get(i));
			//���� �Ǵ��� ownUnitGob �� ownUnitSph�� ���� ����
		}
	}

	//������ �ִ� ���ָ��
	void show_own_goblins()
	{
		System.out.printf("���� ������ ������ ����� %d��, â ����� %d���Դϴ�.\n", ownUnitGob.size(), ownUnitSph.size());
		System.out.printf("�� %d���Դϴ�.", currentUnit.size());
		System.out.println();
		System.out.println();
	}

	// �����ϰԲ�
	void make_goblins_attack()
	{
		for(int i = 0; i < currentUnit.size(); i++)
		{
			System.out.println("attack() ȣ�� : "+"["+currentUnit.get(i).getClass().getSimpleName()+"]"+"�� �����մϴ�!" + "���� ������("+((Goblin)currentUnit.get(i)).damage+")");

		}
		System.out.println();
	}

	// add ��� �޼��� �޼��� �� ���� �ߺ�����, �ϳ��� �Ķ���Ͱ� ��� ��ü, �ٸ� �ϳ��� �Ķ���Ͱ� â��� ��ü
	void add_goblins(Goblin gob)
	{
		if (ownUnitGob.contains(gob))
		{
			System.out.println("�̹� �߰��� ����Դϴ�. (error)");
			System.out.println();
		}
		else
		{
			System.out.println("����� �߰��Ǿ����ϴ�.");
			currentUnit.add(gob);
			ownUnitGob.add(gob);
			System.out.println();
		}
	}
	
	void add_goblins(SphereGoblin sph)
	{
		if(ownUnitSph.contains(sph))
		{
			System.out.println("�̹� �߰��� â ����Դϴ�. (error)");
			System.out.println();
		}
		else
		{
			System.out.println("â ����� �߰��Ǿ����ϴ�.");
			currentUnit.add(sph);
			ownUnitSph.add(sph);
			System.out.println();
		}
	}

	// remove ��� �޼��� �� ���� �ߺ�����, �ϳ��� �Ķ���Ͱ� ��� ��ü, �ٸ� �ϳ��� �Ķ���Ͱ� â��� ��ü
	void remove_goblins(Goblin gob)
	{
		if (removedUnit.contains(gob))     //�̹� ���ŵ� �� �ִ� �� ������.
		{
			System.out.println("�̹� ���ŵ� �����Դϴ�.");
		}
		if (!(ownUnitGob.contains(gob)))  //���� �����ϰ� �ִ� ������� �ƴ���
		{
			System.out.println("�����ϰ� ���� ���� ����Դϴ�. (error)");
			System.out.println();
		}
		else 
		{
			System.out.println("����� ���ŵǾ����ϴ�.");
			currentUnit.remove(gob);	//���� ��� ������Ͽ��� ����
			ownUnitGob.remove(gob);		//���� ���� ��� ��Ͽ��� ����
			removedUnit.add(gob);		//���ŵ� ���� ��Ͽ� �߰�
			System.out.println();
		}
	}
	
	void remove_goblins(SphereGoblin sph)
	{
		if (removedUnit.contains(sph))	//�̹� ���ŵ� �� �ִ��� ������.
		{
			System.out.println("�̹� ���ŵ� �����Դϴ�.");
		}
		if (!(ownUnitSph.contains(sph)))	// ���� �����ϰ� �ִ� â������� �ƴ���
		{
			System.out.println("�����ϰ� ���� ���� â ����Դϴ�. (error)");
			System.out.println();
		}
		else 
		{
			System.out.println("â ����� ���ŵǾ����ϴ�.");
			currentUnit.remove(sph);	//���� ��� ������Ͽ��� ����
			ownUnitSph.remove(sph);		//���� ���� â��� ��Ͽ��� ����
			removedUnit.add(sph);		//���ŵ� ���� ��Ͽ� �߰�
			System.out.println();
		}
	}
	
	//���¼Ӽ� ���
	void show_status() 
	{
//		super.show_status();
		System.out.println("�̸�: " + this.getClass().getSimpleName());
		System.out.println("���: " + this.rank);
		System.out.println("������: " + this.size);
		System.out.println("������: " + this.life);
		System.out.println();
	}
	
	
	//���� ���� �Ҵ� �ȵ� ���� �ľ�
	 void status(Goblin u) {
		if (currentUnit.contains(u))
		{
			this.status = "����";
		}
		else if (removedUnit.contains(u))
		{
			this.status = "����";
		}
		else
		{
			this.status = "�Ҵ���� ����";
		}
		System.out.println("��������: " +this.status);
	}

}
