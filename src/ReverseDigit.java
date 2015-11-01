import acm.program.ConsoleProgram;

public class ReverseDigit extends ConsoleProgram {
	
	int RN = 0;
	

	public void run () {
		
int N = readInt("Please enter the Integer digit to reverse : ");


while(N>0){
	
RN = RN * 10 + N % 10;	

N =N/10;
}
println("The reversed number is " + RN);
	}

}
