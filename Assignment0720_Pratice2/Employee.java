package Assignment0720_Pratice2;

public abstract class Employee {
	String irum = "";
	int nai = 1;
	
	abstract double pay();
	abstract void data_print();
	void irum_nai_print() {
		System.out.printf("이름 : %s, 나이 : %d", irum, nai);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temporary t = new Temporary("홍길동", 25,20, 150000);
		Regular r = new Regular("한국인", 27, 3500000);
		Salesman s = new Salesman("손오공", 29, 1200000, 5000000, 0.25);
		
		t.data_print();
		r.data_print();
		s.data_print();
	}

}
