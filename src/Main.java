import java.util.Scanner;


/*
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepPlaying =true;
		
		while(keepPlaying != false){
			Game game = new Game();
			game.StartGame();
			String s = scan.nextLine();
			if(s.equals( "")){
				System.out.println("------------------");
				keepPlaying = true;
			}
			else if(s.equals("q") || s.equals("Q") ){
				System.out.println(" Thanks for playing GOD BYE!");
				keepPlaying = false;
			}

		}
	}
}
