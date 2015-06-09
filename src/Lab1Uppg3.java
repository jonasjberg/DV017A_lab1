import java.util.Scanner;

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

public class Lab1Uppg3 {

	public static void main(String[] args) {
        /* Skapa Scanner-objekt för att läsa I/O. Ignorera IDE:ns varningar. */
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);	
		
        System.out.println("Program som konverterar mil till km.");
        
        System.out.print("Skriv in antal mil: ");
        double mil = scan.nextDouble();

        double kilometer = mil * 1000;
        
        System.out.println("Motsvarande antal km: " + kilometer);
	}
}
