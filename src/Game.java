
/*
 * 
 */
public class Game {
	private Deck deck = new Deck();
	
	protected void StartGame(){
		makeTheDeck();
		points(pickCard2(), pickCard1());
		playAgain();
	}
	
	// gö kortlek, hälsar välkommen
	protected void makeTheDeck(){
		System.out.println("Welcome to the game lucky one");
		System.out.println("---Playing a single game---");
		deck.makeDeck();
		deck.shuffleDeck();
	}
	
	// dra korten
	protected int pickCard1(){	
		System.out.print( "Computer draws ");
		deck.pickACard(0);
		int comp = deck.compareCard(0);
		return comp;
	}
	protected int pickCard2(){	
		System.out.print( "Human draws ");
		deck.pickACard(1);
		int human = deck.compareCard(1);
		return human;
	}
	
	// jämför kort och bestäm vinnare
	protected void points(int h, int c){
		if(h>c){
			System.out.println("Human WON!! GZ!!");
		}
		else if(h<c){
			System.out.println("Computor WON !! HAHA !!");
		}
		else{
			System.out.println("Noone won FUCK OFF try again!");
		}
	}
	
	// val av att spela igen
	protected void playAgain(){
		System.out.println("");
		System.out.println(" Press enter key yo play again or type q or Q to exit the game");
	}
	
}
