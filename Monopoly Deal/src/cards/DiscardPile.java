package cards;

import java.util.List;

import board.Table;

public class DiscardPile extends Deck {
	public DiscardPile(Table gameTable, List<Card> cards) {
	}

	public DiscardPile(Table gameTable) {
	}

	public void draw() {

	}

	public String toString() {
		return super.toString();
	}

	public String getDeckName() {
		return "Discard Pile";
	}

}