package cards;

import junit.framework.*;

public class DeckTest extends TestCase {
	protected int quantity;
	protected Deck deck;
	
    protected void setUp() {
    	quantity = 52;
    	deck = new Deck(quantity);
    }
    
    public void testShouldCreateDifferentDecks() {
    	Deck deckOne = new Deck(32);
    	Deck deckTwo = new Deck(24);
    	Deck deckThree = new Deck(52);
    	
    	assertEquals("AS", deckOne.cardList.get(31).getName());
    	assertEquals("TREFL", deckOne.cardList.get(31).getColor());
    	
    	assertEquals("AS", deckTwo.cardList.get(23).getName());
    	assertEquals("TREFL", deckTwo.cardList.get(23).getColor());
    	
    	assertEquals("AS", deckThree.cardList.get(51).getName());
    	assertEquals("TREFL", deckThree.cardList.get(51).getColor());
    	
    	assertNotNull("Passed", deckOne.cardList.get(5));
    	assertNotNull("Passed", deckTwo.cardList.get(10));
    	assertNotNull("Passed", deckThree.cardList.get(15));
    }
    
    public void testShouldTakeFirstCard() {
    	Card card = deck.firstCard();
    	assertEquals("2", card.getName());
    	assertTrue("KIER" == card.getColor());
    	assertFalse("KARO" == card.getColor());
    }
    
    public void testShouldShuffleAndSort() {
    	Card cardA = deck.firstCard();
    	
    	deck.shuffleDeck();
    	
    	Card cardB = deck.firstCard();
    	assertNotSame(cardA, cardB);
    	
    	deck.sortDeck();
    	
    	Card cardC = deck.firstCard();
    	assertSame(cardA, cardC);
    }
    
}