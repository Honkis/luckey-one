import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 */
public class Deck {
	private ArrayList<Card> Deck = new ArrayList<Card>();
	
	public void makeDeck(){
		String[] colourx = {"Hearth","Spade","Clubs", "Diamond"};
		String[] valuex = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Knight","Queen","King"};
		for(int c = 0; c <= 3 ; ++c){
			for(int v = 0; v <= 12 ; ++v){
				Deck.add(new Card( valuex[v] , colourx[c], v+1, c));
			}
		}
	}
	
	protected void shuffleDeck(){
		Collections.shuffle(Deck);
	}
	protected void pickACard(int p){
		System.out.println(Deck.get(p));
	}
	protected int compareCard(int i){
		return Deck.get(i).toInt();
	}
	
}
