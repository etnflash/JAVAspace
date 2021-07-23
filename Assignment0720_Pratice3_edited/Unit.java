package Assignment0720_Pratice3_edited;

public abstract class Unit {
	// 기본 속성들 sub클래스에 물려줌
	String rank;
	int life;
	String size;
	//*유닛의 상태 추가적으로 만들어봄****  //메서드도 오버로딩으로 만듦
	String status = "";

	//속성 초기화 메서드
	public void init() {
		String rank = "";
		life = 0;
		String size = "";
	}
	
	//각 유닛 클래스 속성 출력 메서드 오버라이딩 해줄거임
	void show_status() 
	{
		System.out.println("이름: " + this.getClass().getSimpleName());
		System.out.println("등급: " + this.rank);
		System.out.println("사이즈: " + this.size);
	}
	
	
}

