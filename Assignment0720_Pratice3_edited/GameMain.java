package Assignment0720_Pratice3_edited;
import java.util.*;
public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Unit> allUnitList = new ArrayList<>();  //������ ��� �߿� �Ҵ� �ȵ� ��� �ѹ��� ������� 
															//�� add_goblins() �̿���� ��
		
		// ���� ���ֵ� 3�� ���� ��� 2, â��� 1
		Goblin goblin_1 = new Goblin("����", "small", 100, "��������", 15);
		Goblin goblin_2 = new Goblin("����", "small", 100, "��������", 15);
		SphereGoblin sphere_goblin_1 = new SphereGoblin("����", "small", 100, "������ ����", 10, "�� â");
		
		allUnitList.add(goblin_1);					// ������Ų ��� 1,2 �׸��� â��� 1�� allUnitList�� ����
		allUnitList.add(goblin_2);
		allUnitList.add(sphere_goblin_1);
		
		
		
		
		Hero hero_1 = new Hero("����", "big", 300, allUnitList); //allUnitList �� [goblin_1, goblin_2, sphere_goblin_1]�������
		
		hero_1.show_status(); 		//����� �Ӽ� ���
		hero_1.show_own_goblins();    // ��� 2��, â��� 1��, �� 3��
		hero_1.make_goblins_attack(); //3���̼� ����
		
		//�̹� �Ҵ��Ų ���ֵ��� allUnitList ���� clear ������
		allUnitList.clear();
		
		// �� ���� ����, �Ҵ��� ���Ƿ�	// allUnitList�� ���� ���ϰ� �̹����� �ؿ��� add_goblins() �޼��� �̿��ؼ� �Ѹ��߰� �Ұ���
		Goblin goblin_4 = new Goblin("����", "small", 100, "��������", 20);  // goblin_4 ���� ����
		SphereGoblin sphere_goblin_2 = new SphereGoblin("����", "small", 100, "������ ����", 5, "�� â"); // sphere_goblin_2 ���� ����
		Goblin goblin_5 = new Goblin("����", "small", 100, "��������", 20);  // goblin_5 ���� ����
		
			
		hero_1.add_goblins(goblin_4);  // 29��° �ٿ��� ������ �� �Ҵ� -> ����� �߰��Ǿ����ϴ�. �޽��� ���
		hero_1.add_goblins(goblin_4);  // ���� ���� �� ���� -> �̹� �߰���~ error �޼��� ���
		
		hero_1.show_own_goblins();	// ��� 3��, â��� 1��, �� 4��
		
		hero_1.add_goblins(sphere_goblin_2); // 30�����ٿ��� ���� �س��� �� �Ҵ� -> â����� �߰��Ǿ����ϴ�. �޽��� ���
		hero_1.show_own_goblins();  // ��� 3��, â��� 2��, �� 5��
		
		 // 5���̼� ����
		
		
		
		hero_1.remove_goblins(goblin_4);  // ���� ����
		hero_1.remove_goblins(goblin_4);  // �̹� ���ŵ� �����Դϴ�, �����ϰ� ���� ����~ error �޼��� �Ѵ� ���
		
		hero_1.remove_goblins(sphere_goblin_2); // ���� ����
		
		hero_1.remove_goblins(goblin_5); //31��°�� ������ �ϰ� �Ҵ�� �� ��� -> �����ϰ� ���� ���� ����Դϴ� �޽����� ���
		
		hero_1.show_own_goblins();	// ��� 2��, â��� 1��, �� 3��
		hero_1.make_goblins_attack();  //3���̼� ����
		
		
		
		goblin_1.show_status();
		hero_1.status(goblin_1);	// hero_1�� �Ҵ�� goblin_1 ����������
		
		sphere_goblin_2.show_status();
		hero_1.status(sphere_goblin_2);		// hero_1�� �Ҵ�� sphere_goblin_2 ���ŵ�
		
		goblin_5.show_status();
		hero_1.status(goblin_5);		// hero_1�� �Ҵ���� ����
		
		
	}

}
