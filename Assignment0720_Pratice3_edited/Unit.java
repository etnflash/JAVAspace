package Assignment0720_Pratice3_edited;

public abstract class Unit {
	// �⺻ �Ӽ��� subŬ������ ������
	String rank;
	int life;
	String size;
	//*������ ���� �߰������� ����****  //�޼��嵵 �����ε����� ����
	String status = "";

	//�Ӽ� �ʱ�ȭ �޼���
	public void init() {
		String rank = "";
		life = 0;
		String size = "";
	}
	
	//�� ���� Ŭ���� �Ӽ� ��� �޼��� �������̵� ���ٰ���
	void show_status() 
	{
		System.out.println("�̸�: " + this.getClass().getSimpleName());
		System.out.println("���: " + this.rank);
		System.out.println("������: " + this.size);
	}
	
	
}

