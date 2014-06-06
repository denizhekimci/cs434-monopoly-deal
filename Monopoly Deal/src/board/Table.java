package board;

import java.util.List;
import java.util.Stack;

import cards.Card;

public class Table {
	private final int NUM_OF_PLAYERS = 2;

	private Deck deck;
	private Player[] players;
	private boolean isTableInit;
	private List<Card> hand;

	private Stack<Card> drawPile;

	private GameFactory factory;

	public Table() {
		players = factory.createPlayers();
		init();
	}

	public void init() {
		isTableInit = true;
		this.deck = new Deck(this);
		initPlayers();

		drawPile = new Stack<Card>();
		players[0].createDiscardedHand();
		players[1].createDiscardedHand();

	}

	private void initPlayers() {
		for(int i = 0; i < players.length; i++) {
			List<Card> aDeck = deck.getCurrentDeck();
			this.hand = deck.drawCards();

			for (int j = 0; j < hand.size(); j++) {
				aDeck.remove(j);
			}
			initDrawPile(aDeck);
		}
	}

	public void initDrawPile(List<Card> aDeck) {
		for (int k = 0; k < drawPile.size(); k++) {
			for (int j = 0; j < aDeck.size(); j++) {
				if(aDeck.get(k) != null)
					drawPile.add(aDeck.get(j));
			}
		}
	}

	public Deck getCurrentDeck() {
		return deck;
	}

	public void setNumOfPlayers(int numOfPlayers) {
		numOfPlayers = NUM_OF_PLAYERS;
	}

	public int getNumOfPlayers() {
		return NUM_OF_PLAYERS;
	}

	public List<Card> getHand() {
		return hand;
	}

	public Player[] getPlayers() {
		return players;
	}

	public boolean isTableInit() {
		return isTableInit;
	}
}
