package cards;

import java.util.List;

import board.Deck;
import board.Table;

public abstract class Card {
	List<Card> discardedHand;
	List<Card> hand;
	
	public Card(Table table, Deck deck) {
		hand = table.getHand();
	}
	
	public final void takeAction() {
		if(cardIsActionCard()) {
			checkDiscardedHandOfOpponent();
		}
		performCardOperation();
		display();
	}
	
	public void checkDiscardedHandOfOpponent() {
//	String disc = null;
//	for(Card discCard : discarded) {
//		if(discCard instanceof PropertyCard) {
//			disc = discCard.toString();
//		}
//		
//		for(Card handCard : hand) {
//			if(handCard instanceof PropertyCard) {
//				if(disc != null && disc.equals(handCard.toString())) {
//					hand.add(discCard);
//					result = disc + " stealed!";
//				}
//			}else if(handCard instanceof JustSayNoCard) {
//				result = "rejected";
//			}
//		}
//	}
//	
//	return result;		
}
	
	public abstract void performCardOperation();
	
	public abstract void display();
	
	public boolean cardIsActionCard() {
		return true;
	}
	
	
}