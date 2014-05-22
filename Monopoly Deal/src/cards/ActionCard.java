package cards;

import java.awt.List;

public abstract class ActionCard extends Card {
	protected List cards = new List();

	public ActionCard() {

		for (int i = 0; i < 4; i++) {
			// add cards
		}
	}

	@Override
	public void draw() {

	}

	@Override
	public void returnToSource() {

	}

	@Override
	public void setSource(Deck source) {

	}

	@Override
	public String toString() {
		return null;

	}

	@Override
	public String source() {
		return null;
	}

}