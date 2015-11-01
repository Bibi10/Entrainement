import acm.graphics.*;
import acm.program.*;

/**This program draws a checkboard on the graphics windows
 * 
 */

/**
 * @author BibiX
 *
 */
public class Checkboard extends GraphicsProgram {

	private final int NROWS = 10;
	private final int NCOLUMNS = 10;
	
	/**
	 * 
	 */
	public void run () {
		for (int i = 0; i< 10; i++) {
			
		 for (int j = 0; j< 10; j++) {
		 
		 int squaresz = getHeight() /10;
		 
		 int x = i * squaresz;
		 int y = j * squaresz;
		 
		 GOval square = new GOval(x, y, squaresz, squaresz );
		 square.setFilled(((i + j) % 2) !=0);
		 add(square);
		 	}
		}
	}

}
