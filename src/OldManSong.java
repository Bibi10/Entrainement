/*This program show OldMan song lyrics
 * 
 * 
 *  int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
 */
import acm.program.ConsoleProgram;

public class OldManSong extends ConsoleProgram  {
	

		
	private final int verse = 10;
	//private final char line 2 = shoe;
	//private String verse;
	
	//@SuppressWarnings("unused")
	public void run () {
		for (int verse = 1; verse <= 10; verse++)
		
		{  
			println("This old man, he played "+verse);								
		switch (verse) {
		
		case 1: println( " This old man, he played shoe " );
		break;
        case 2: println( " This old man, he played knee " );
        break;
        case 3: println( " This old man, he played door " );
        break;
        case 4: println( " This old man, he played hive " );
        break;
        case 5: println( " This old man, he played sticks " );
        break;
        case 6: println( " This old man, he played up to heaven " );
        break;
        case 7: println( " This old man, he played pate " );
        break;
        case 8: println( " This old man, he played pine " );
        break;
        case 9: println( " This old man, he played shin " );
        break;
                
		}
									
			println("He played knick-knack on my thumb. ");
			println("With a knick-knack, paddy-whack,");
			println(" Give your dog a bone.");
			
		
		};
		
	}

}
