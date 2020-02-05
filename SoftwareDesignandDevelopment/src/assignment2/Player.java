package assignment2;

public class Player {
	public static void main(String[] args) {
		Hand ch = new Hand();
		ch.generateHand();
		for (UnoDeck c : ch.UnoDecks) {
			System.out.println(c.getValue() + " of " + c.getSuit());
		}
	}
}
