package Assignment0720_Pratice2;

public class Salesman extends Regular{
	int sales;
	double commision;

	Salesman() {
		irum = "";
		nai = 1;
		sales = 0;
		commision = 0;
	}
	
	Salesman (String irum, int nai, int salary, int sales, double commision) {
		this.irum = irum;
		this.nai = nai;
		this.salary = salary;
		this.sales = sales;
		this.commision = commision;
		
	}
	
	double pay()
	{
		return salary + sales*commision;
	}

	@Override
	void data_print() {

		System.out.printf("이름 : %s, 나이 : %d, 월급 : %.0f", irum, nai, pay());
		System.out.println();
	}
	
	void irum_nai_print() {
		System.out.printf("이름 : %s, 나이 : %d", irum, nai);
	}

}
