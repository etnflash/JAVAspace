package Assignment0720_Pratice2;

public class Regular extends Employee{
	int salary;

	Regular ()
	{
		irum = "";
		nai = 1;
		salary = 0;
	}
	
	Regular (String irum, int nai, int salary)
	{
		this.irum = irum;
		this.nai = nai;
		this.salary = salary;
	}
	
	@Override
	double pay() {
		return salary;
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
