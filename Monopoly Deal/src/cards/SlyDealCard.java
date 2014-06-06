package cards;

import java.util.List;

import board.Deck;
import board.Table;

public class SlyDealCard extends ActionCard{
	
	public SlyDealCard(Table table, Deck source) {
		super(table, source);
	}

	public String performSlyDeal(List<Card> discarded, List<Card> hand) {
		String result = "";
		
		String disc = null;
		for(Card discCard : discarded) {
			if(discCard instanceof PropertyCard) {
				disc = discCard.toString();
			}
			
			for(Card handCard : hand) {
				if(handCard instanceof PropertyCard) {
					if(disc != null && disc.equals(handCard.toString())) {
						hand.add(discCard);
						result = disc + " stealed!";
					}
				}else if(handCard instanceof JustSayNoCard) {
					result = "rejected";
				}
			}
		}
		
		return result;
	}
	
	public String toString() {
		return "Sly Deal Card";
	}

	public void display() {
		
	}

	public String checkHandOfOpponent(List<Card> discarded, List<Card> hand) {
		return null;
	}

	public void performCardOperation() {
		
	}

}
