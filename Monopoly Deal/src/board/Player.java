package board;

import cards.Card;

public class Player {
	private Card aCard;

	public Player(Table gameTable) {

	}

	public void turn() {
	}

	private Card playMoneyOrActionCard() {
		return aCard;
	}

	private Card playPropertyCard() {
		return aCard;
	}

	private Card playActionCardInDiscardPile() {
		return aCard;
	}

	public int numHouses() {
		return 0;
	}

	public int numHotels() {
		return 0;
	}
}
