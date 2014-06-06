package board;

import java.util.ArrayList;
import java.util.List;

import cards.ActionCard;
import cards.Card;
import cards.DealBreakerCard;
import cards.JustSayNoCard;
import cards.PropertyCard;
import cards.SlyDealCard;

public class GameFactory {
	private Deck deck;
	private Table table;
	
	private List<Card> currentDeck;
	private List<Card> discardedDeck;
	private final int NUM_OF_PROPERTIES = 30;
	//action cards
	private final int NUM_OF_SLYDEAL = 2;
	private final int NUM_OF_DEAL_BREAKERS = 2;
	private final int NUM_OF_JUST_SAY_NOS = 2;

	private final String[] cardGroups = {"a", "b", "c"};
	
	public GameFactory() {
		
	}
	
	public Deck createDeck(Table table) {
		this.deck = table.getCurrentDeck();
		currentDeck = deck.getCurrentDeck();
		List<PropertyCard> properties = deck.getPropertyCards();
		List<ActionCard> actions = deck.getActionCards();
		initDeck(properties, actions);
		initCards(properties, actions);
		return deck;
	}
	
	public Player[] createPlayers() {
		Player player1 = new Player(table, deck);
		Player computer = new Player(table, deck);
		
		Player[] players = new Player[2];
		players[0] = player1;
		players[1] = computer;
		
		return players;
	}
	
	private void initDeck(List<PropertyCard> properties,
			List<ActionCard> actions) {
		
		for (int i = 0; i < properties.size(); i++) {
			Card aCard;
			aCard = properties.get(i);
			currentDeck.add(aCard);
		}
		for (int j = 0; j < actions.size(); j++) {
			Card pCard;
			pCard = actions.get(j);
			currentDeck.add(pCard);
		}
	}

	public void initCards(List<PropertyCard> properties,
			List<ActionCard> actions) {
		properties = new ArrayList<PropertyCard>();
		actions = new ArrayList<ActionCard>();

		for (PropertyCard pCard : properties) {
			for (int i = 0; i < NUM_OF_PROPERTIES; i++) {
				pCard = new PropertyCard(table, deck);
				pCard.setGroup(i);
				pCard.setType(cardGroups[i%10]);
				properties.add(pCard);
			}
		}

		JustSayNoCard jsnCard = new JustSayNoCard(table, deck);
		for (int i = 0; i < NUM_OF_JUST_SAY_NOS; i++) {
			actions.add(jsnCard);
		}

		DealBreakerCard dbCard = new DealBreakerCard(table, deck);
		for (int i = 0; i < NUM_OF_SLYDEAL; i++) {
			actions.add(dbCard);
		}

		SlyDealCard sdCard = new SlyDealCard(table, deck);
		for (int i = 0; i < NUM_OF_DEAL_BREAKERS; i++) {
			actions.add(sdCard);
		}
		
	}
	
	public List<Card> getDiscardedDeck() {
		Player[] players = table.getPlayers();
		return players[0].getDiscardedHand();
	}

}
