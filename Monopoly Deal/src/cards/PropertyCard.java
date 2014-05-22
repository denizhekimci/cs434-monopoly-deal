package cards;

public abstract class PropertyCard extends Card {
	public PropertyCard() {
	}

	public String source() {
		return null;
	}

	public void draw() {

	}

	public void returnToSource() {
	}

	public void setSource(Deck source) {
	}

	public String toString() {
		return super.toString();
	}
}
