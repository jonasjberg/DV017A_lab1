/* 
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-09
 *  Jonas Sjöberg, Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *  
 *  Labb #1
 *  Uppgift 3
 */

import java.util.Scanner;

public class Lab1Uppg3 {

	public static void main(String[] args) {
        /* Skapa Scanner-objekt för att läsa I/O. Ignorera IDE:ns varningar. */
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);	
		
        System.out.println("Program som konverterar mil till km.");
        
        System.out.print("Skriv in antal mil: ");
        double mil = scan.nextDouble();

        double kilometer = mil * 1000;
        
        /* Skriv ut med 'format', ekvivalent med 'printf' som i sin tur känns
         * igen från C-liknande språk. 
         * 
         * %.0f		Float with zero places after decimal point.		
         * %n		A new line character appropriate to the platform running the
         *          application. You should always use %n, rather than \n.  
         */
        System.out.format("Motsvarande antal kilometer: %.0f%n", kilometer);
	}
}
