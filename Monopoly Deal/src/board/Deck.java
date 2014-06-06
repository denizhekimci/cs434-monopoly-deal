package board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import cards.ActionCard;
import cards.Card;
import cards.PropertyCard;

public class Deck{
	private List<Card> currentDeck;
	private List<PropertyCard> propertyCards;
	private List<ActionCard> actionCards;
	private final int NUM_OF_CARDS_IN_HAND = 7;
	
	private GameFactory factory;

	public Deck(Table table) {
		this.currentDeck = new ArrayList<Card>();
		this.propertyCards = new ArrayList<PropertyCard>();
		this.actionCards = new ArrayList<ActionCard>();
		factory.createDeck(table);
		
		shuffle();
	}
	
	public void shuffle() {
		long seed = System.nanoTime();
		Collections.shuffle(currentDeck, new Random(seed));
	}

	public List<Card> drawCards() {
		List<Card> aHand = new ArrayList<Card>();
		for (int i = 0; i < NUM_OF_CARDS_IN_HAND; i++) {
			Card card = currentDeck.get(i);
			aHand.add(card);
		}
		return aHand;
	}

	public List<Card> getCurrentDeck() {
		return currentDeck;
	}

	public List<PropertyCard> getPropertyCards() {
		return propertyCards;
	}

	public List<ActionCard> getActionCards() {
		return actionCards;
	}
}