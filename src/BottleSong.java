/*This program show song lyrics
 * 
 * 
 */
import acm.graphics.*;
import acm.program.*;

public class BottleSong extends ConsoleProgram {
	
private static final int Bottles = 101 ; //fix the max of beer 

	public void run() {
		for (int b = Bottles; b >= 2; b--) { //Condition
			println( +b+ " bottles of beer."); //statement
			
			println( +b+ " bottles of beer on the wall.");
			
			println("You take one down, pass it around.");
			
		}
		println("You take down the last bottle");
		// TODO Auto-generated constructor stub
	}

}
