package assignment2;


public class UnoDeck {
	private static String Draw4;

	public enum Suit {
		RED, BlUE, GREEN, YELLOW
	};

	public enum Value {
		ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, DRAW2, REVERSE, SKIP
	};

	private final Suit suit;
	private final Value value;

	public UnoDeck(Suit s, Value gVal)
    {
       suit =s;
       value= gVal;
    }

	public Value getValue() {
		return this.value;
	}

	public String getJoker() {
		return this.Draw4;
	}

	public Suit getSuit() {
		return this.suit;
	}
}
