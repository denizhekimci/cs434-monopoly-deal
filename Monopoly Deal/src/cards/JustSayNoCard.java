package cards;

import java.util.List;

import board.Deck;
import board.Table;

public class JustSayNoCard extends ActionCard {

	public JustSayNoCard(Table table, Deck source) {
		super(table, source);
	}

	public String toString() {
		return "Just Say No";
	}

	public void display() {
		
	}

	public String checkHandOfOpponent(List<Card> discarded, List<Card> hand) {
		return null;
	}

	public void performCardOperation() {
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
	}
}