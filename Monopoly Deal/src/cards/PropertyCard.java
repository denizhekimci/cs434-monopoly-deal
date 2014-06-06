package cards;

import java.util.List;

import board.Deck;
import board.Table;

public class PropertyCard extends Card {

	private Table table;
	private Deck deck;
	private int group;
	private String type;
	
	public PropertyCard(Table table, Deck deck) {
		super(table, deck);
		this.table = table;
		this.deck = deck;
	}

	public String toString() {
		return group + type;
	}

	public void display() {
		
	}
	
	public void checkHand(List<Card> hand) {
		//Property Card
//		1) Check your hand to match a series. 
//		2) If matches, then record them as a series and open them to discarded hand. 
//		3) Else if the opponent has 2 cards fromthe same group, open them and then discard the next card in the hand to match 3 cards rule.
//		4) Else open 3 cards to discard pile.
	}


	public void performCardOperation() {
		
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
