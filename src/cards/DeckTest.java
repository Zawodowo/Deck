package cards;

import junit.framework.*;

public class DeckTest extends TestCase {
	protected int quantity;
	protected Deck deck;
	
    protected void setUp() {
    	quantity = 52;
    	deck = new Deck(quantity);
    }
    
    public void testIfCreated() {
    	assertNotNull("Passed", deck.cardList.get(5));
    	assertNotNull("Passed", deck.cardList.get(10));
    }
    
    public void testPossitionPass() {
    	Card card = deck.firstCard();
    	assertEquals("2", card.getName());
    	assertEquals("KIER", card.getColor());
    }
    
    public void testShuffleAndSort() {
    	Card cardA = deck.firstCard();
    	
    	deck.shuffleDeck();
    	
    	Card cardB = deck.firstCard();
    	assertNotSame(cardA, cardB);
    	
    	deck.sortDeck();
    	
    	Card cardC = deck.firstCard();
    	assertSame(cardA, cardC);
    }
    
}