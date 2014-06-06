package cards;

import board.Deck;
import board.Table;

public class DealBreakerCard extends ActionCard {

	
	public DealBreakerCard(Table table, Deck source) {
		super(table, source);
		takeAction();
	}

	public String toString() {
		return "Deal Breaker Card";
	}
	
	public void display() {
		
	}

	public void performCardOperation() {
		
	}
	

}