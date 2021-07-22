package Assignment0720_Pratice2_edited;

public abstract class Employee {
	static String irum = "";
	static int nai = 1;
	
	abstract double pay();
	abstract void data_print();
	abstract void irum_nai_print();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temporary t = new Temporary("홍길동", 25,20, 150000);
		Regular r = new Regular("한국인", 27, 3500000);
		Salesman s = new Salesman("손오공", 29, 1200000, 5000000, 0.25);
		
		t.data_print();
		r.data_print();
		s.data_print();
		
//		t.irum_nai_print();
//		r.irum_nai_print();
//		s.irum_nai_print();
		
	}

}
