package dev.repayed.moocweekfour.Exercise77LyyraCard;

public class LyrraCardExecution {
	public static void main(String[] args) {
		LyrraCardManager cardPekka = new LyrraCardManager(20);
		LyrraCardManager cardBrian = new LyrraCardManager(30);
		
		cardPekka.payGourmet();
		cardBrian.payEconomical();
		
		System.out.println(cardPekka);
		System.out.println(cardBrian);
		
		cardPekka.loadMoney(20);
		cardBrian.payGourmet();
		
		System.out.println(cardPekka);
		System.out.println(cardBrian);
		
		cardPekka.payEconomical();
		cardPekka.payEconomical();
		
		cardBrian.loadMoney(50);
		
		System.out.println(cardPekka);
		System.out.println(cardBrian);
	}
}
