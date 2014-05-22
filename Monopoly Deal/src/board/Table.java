package board;

import cards.Deck;

public class Table {
	private Deck current;
	private Player player;
	private Boolean initTable;
	private int numberOfPlayers;

	public Table() {
		initTable = false;
	}

	public void init() {
		initTable = true;
		initPlayers();
		initDeck(current);
	}

	private void initPlayers() {

	}

	private void initDeck(Deck current) {

	}

	public void setNumOfPlayers(int numOfPlayers) {
		numOfPlayers = numberOfPlayers;
	}

	public int getNumOfPlayers() {
		return numberOfPlayers;
	}

	public void setGui() {
	}

	public void getUserGame() {

	}
}
