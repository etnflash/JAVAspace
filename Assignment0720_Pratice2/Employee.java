package Assignment0720_Pratice2;

public abstract class Employee {
	String irum = "";
	int nai = 1;
	
	abstract double pay();
	abstract void data_print();
	void irum_nai_print() {
		System.out.printf("�̸� : %s, ���� : %d", irum, nai);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temporary t = new Temporary("ȫ�浿", 25,20, 150000);
		Regular r = new Regular("�ѱ���", 27, 3500000);
		Salesman s = new Salesman("�տ���", 29, 1200000, 5000000, 0.25);
		
		t.data_print();
		r.data_print();
		s.data_print();
	}

}
