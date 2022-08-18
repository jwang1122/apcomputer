package section2;

import java.util.Arrays;

public class Problem15 {

	public static void main(String[] args) {
		int[] cards = {0,1,2,3,4,5,6,7,8,9};
		Deck deck = new Deck(cards);
		System.out.println(deck.inOrder());
		System.out.println(deck.reorderingCount());
	}

}

class Deck {
	private int[] cards;

	public Deck(int[] newcards) {
		cards = newcards;
	}

	public void shuffle() {
		int[] newCards = new int [cards.length];
		for(int k = 0; k < cards.length/2; k++) {
			newCards[k*2] = cards[k] ;
			newCards [k*2+1] = cards [cards.length/2 + k];
		}
		cards = newCards;
	}
//		Random rand = new Random();
//		
//		for (int i = 0; i < cards.length; i++) {
//			int randomIndexToSwap = rand.nextInt(cards.length);
//			int temp = cards[randomIndexToSwap];
//			cards[randomIndexToSwap] = cards[i];
//			cards[i] = temp;
//		}

	public int reorderingCount() {
		/* to be implemented in part (c) */
		int count= 0;
		do {
			shuffle();
			System.out.println(Arrays.toString(cards));
			count++;
		}while(!inOrder());
		
		return count; 
	}
//		while ( !inOrder( ) || count == 0) {
//			shuffle() ; 
//			count += 1; 
//		}

	// precondition: For all k such that
	// 0<= k<cards.length,
	// 0<= cards[k] < cards.length and
	// each card [k] is unique
	// postcondition: returns true if
	// cards[k]== k for all
	// 0 <= k < cards.length; returns
	// false otherwise
	public boolean inOrder() {
		for (int k = 0; k < cards.length; k++) {
			if (cards [ k] != k) {
				return false;
			}
		}
		return true;
	}
}