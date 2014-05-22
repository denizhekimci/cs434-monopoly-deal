package cards;

import java.util.List;

import board.Table;

public class DrawPile extends Deck {

	@Override
	public String getDeckName() {
		return null;
	}

	public DrawPile(Table gameTable, List<Card> cards) {
	}

	public DrawPile(Table gameTable) {
	}

	public String toString() {
		return super.toString();
	}
}
