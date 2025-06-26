/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author Muhammad Conn
 * @version 1.0
 */

public class Main {

	/* ALGORITHM
	*
	1. Create 52-item card array
	2. Create 4-item array of suits
	3. loop through the suits, nest a loop that loops through 13 cards within each suit, initializing cards
	4. Print each card
	5. Print newline after each suit finishes
	*
	*/
	public static void main(String[] args) {
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		CardTester.main(null);
		/*** DRIVER PROGRAM ***/
		// Create array
		Card[] deck = new Card[52];

		// Array of suits for easy array construction
		char[] suits = new char[4];
		suits[0] = Card.HEART;
		suits[1] = Card.DIAMOND;
		suits[2] = Card.CLUB;
		suits[3] = Card.SPADE;

		// Loop through all 4 suits, within each suit loop through all 13 cards
		int deckNum = 0; // Int to keep track of what deck card we're in since we loop through suits and not the whole deck
		
		for (int suit = 0; suit < 4; suit++){
			for (int card = 0; card < 13; card++){
				deck[deckNum] = new Card(card + 1, suits[suit]);
				System.out.print(deck[deckNum].toString() + "  ");
				deckNum++;
			}
			System.out.println(); // Newline after every suit
		}
	}
}
