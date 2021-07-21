package Assignment0720_Pratice2;

public class Temporary extends Employee {
	int ilsu;
	int ildang;
	
	Temporary()
	{
		irum = "";
		nai = 1;
		ilsu = 0;
		ildang = 0;
	}
	
	Temporary(String irum, int nai, int ilsu, int ildang)
	{
		this.irum = irum;
		this.nai = nai;
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	
	double pay()
	{
		return ilsu*ildang;
	}

	@Override
	void data_print() {
		// TODO Auto-generated method stub
		System.out.printf("이름 : %s, 나이 : %d, 월급 : %.0f", irum, nai, pay());
		System.out.println();
	}
	
	void irum_nai_print() {
		System.out.printf("이름 : %s, 나이 : %d", irum, nai);
	}

}
