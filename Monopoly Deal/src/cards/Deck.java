package cards;

import board.Player;

public abstract class Deck {
	private Card card;
	private Player player;

	public void shuffle() {

	}

	public void drawCard() {

	}

	public abstract String getDeckName();
}