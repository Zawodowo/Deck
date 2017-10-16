package cards;
import java.util.*;
import java.util.ArrayList;

public class Deck {
	ArrayList<Card> cardList = new ArrayList<>();
	int quantity;
	
	Deck(int quantity) {
		this.quantity = quantity;
		createDeck(this.quantity);
	}
	
	public void createDeck(int n) {
		String[] colors = {"KIER","KARO","PIK","TREFL"};
		String[] faces = {"2","3","4","5","6","7","8","9","10","WALTE","DAMA","KROL","AS"};
		int k=0;
		if(quantity == 32) k=5;
		if(quantity == 24) k=7;
		for(int i=k; i<13; i++) {
			for(int j=0; j<4; j++) {
				cardList.add(new Card(faces[i], colors[j], j+(i*4)));
			}
		}
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cardList);
	}
	
	public void sortDeck() {
		int change=0;
		do {
			change=0;
			for(int q=1; q<this.quantity; q++) {
				Card tempOne = cardList.get(q-1);
				Card tempTwo = cardList.get(q);
				if(tempOne.getValue() > tempTwo.getValue()) {
					Collections.swap(cardList, q-1, q);
					change=1;
				}
			}
		}while(change!=0);
	}
	
	public Card firstCard() {
		Card temp = cardList.get(0);
		return temp;
	}
}