/*This program reads in positive integer N 
 * and then calculates and displays the sum of the first N odd integers
 *
*/


import acm.program.ConsoleProgram;
public class OddSum extends ConsoleProgram {
private int N ;

public void run() {
   	int x = 1;
	int sum = 0;
	
	int N = readInt("N :" );
	
	for (int n = 0; n < N; n++) {
		
		x +=2;
		sum += x;			
		
						
						}
	
println("sum = " +sum );
	
println("N = " +N);  
				
				}
		

	}


