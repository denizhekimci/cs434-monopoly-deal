package board;

import java.util.List;

import cards.Card;
import cards.PropertyCard;

public class Player {
	private List<Card> hand;
	private List<Card> discardedHand;
	private int discardCount;
	private final int NUM_OF_CARDS_IN_HAND = 7;

	public Player(Table table, Deck current) {
		this.hand = current.drawCards();
		discardCount = 0;
	}

	public void takeTurn() {
		for(Card card : hand) {
			card.takeAction();
		}
		createDiscardedHand();
	}
	
	public void createDiscardedHand() {
		for(Card card : hand) {
			if(card instanceof PropertyCard) {
				((PropertyCard) card).checkHand(discardedHand);
			}
		}
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public List<Card> getDiscardedHand() {
		return discardedHand;
	}

	public void setDiscardedHand(List<Card> discardedHand) {
		this.discardedHand = discardedHand;
	}
}
