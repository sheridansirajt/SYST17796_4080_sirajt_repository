package assignment2;

public class Hand {
	private int handSize = 52;
	public UnoDeck[] UnoDecks = new UnoDeck[handSize];

	public void generateHand() {
		int countUnoDecks = 0;
		for (UnoDeck.Suit s : UnoDeck.Suit.values()) {
			for (UnoDeck.Value v : UnoDeck.Value.values()) {
				UnoDecks[countUnoDecks] = (new UnoDeck(s, v));
				countUnoDecks++;
			}
		}
	}
}
