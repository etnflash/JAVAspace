package Assignment0720_Pratice1_edited;

public class CoinIn {

	public int coin;
	public int change;
	
	public int cofPrice;
	public String conti;

	public CoinIn()
	{
		coin = 0;
		change = 0;
		
		cofPrice = 200;
		conti = "";
	}
	
	public void culc(int cupCount) 
	{
		change = coin - cofPrice * cupCount;
	}

	
}
