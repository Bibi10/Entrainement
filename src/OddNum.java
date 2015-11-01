/*This program that displays the integers 
 * between 1 and 100 that are divisible by either 6 or 7.
 * 
 * */
import acm.program.ConsoleProgram;

public class OddNum extends ConsoleProgram {

		
		public void run() {
		        for (int i = 1; i<=100; i++){
			        
			             if((i % 6 == 0 || i % 7 == 0) && !(i % 6 == 0 && i % 7 == 0)){
			             println(i);
		
			             }
		        }


		}
	}