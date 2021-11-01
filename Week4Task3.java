
public class Week4Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LyyraCard card = new LyyraCard(50, "Juika");
		LyyraCard card1 = new LyyraCard(2, "Leila");
		System.out.println(card);
		card.payEconomical();
		card.payGourmet();
		card1.payEconomical();
		card1.payGourmet();
		card.loadMoney(10);
		card.loadMoney(10);
		card1.payEconomical();
		card1.payGourmet();
		
	}
	
}
