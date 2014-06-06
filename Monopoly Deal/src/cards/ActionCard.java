package cards;


import board.Deck;
import board.Table;

public abstract class ActionCard extends Card{
	
	public ActionCard(Table table, Deck source) {
		super(table, source);
		// TODO Auto-generated constructor stub
	}

	public boolean isCardActionCard() {
		return true;
	}
}