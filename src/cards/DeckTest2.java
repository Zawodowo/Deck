package cards;

import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertEquals;
import org.junit.*;

public class DeckTest2 {
	protected int quantity = 52;
	protected Deck deck = new Deck(quantity);
	
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    @Test
    public void testIfCreated() {
    	assertNotNull("Passed", deck.cardList.get(5));
    	assertNotNull("Passed", deck.cardList.get(10));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void outOfBounds() {
        deck.cardList.get(1000);
    }
    
    @Test(timeout = 1000)
    public void tooLongShuffle() {
    	Card cardA = new Card("5", "PIK", 11);
    	Card cardB;
    	do {
    		deck.shuffleDeck();
    		cardB = deck.firstCard();
    	} while(cardA != cardB);
    	deck.sortDeck();
    }
    
    @Ignore("not ready") public void something() {
    	System.out.println("Soon.");
    }
    
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod.");
    }
}
