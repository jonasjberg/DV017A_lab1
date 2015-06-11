import java.util.Scanner;

/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-09
 *  Jonas Sjöberg, Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 5
 */

public class Lab1Uppg5 {

	private static final String QUERY = "Ange det heltal som du vill räkna ner från: ";

	public static void main(String[] args) {
		/* Skapa Scanner-objekt för att läsa I/O. Ignorera IDE:ns varningar. */
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int start = -1;

        do {
        /* Loopa tills inmatning är ett nollskiljt och positivt heltal. */
		System.out.print(QUERY);

            while (!scan.hasNextInt()) {
                /* Loopa tills nästa "token" i scan's lista går att parsea till en
                 * int. Avgränsare mellan "tokens" är whitespace som standard,
                 * där whitespace är mellanslag och andra tecken som motsvarar
                 * tomt vertikalt eller horisontellt utrymme i text.
                 */
                System.out.print(QUERY);
                scan.next();
            }

            /* Scan måste hålla en int i sin "lista" som är OK att använda. */
            start = scan.nextInt();

        } while (start <= 0);	
        
        
        while (start > 0) {
//        	if ((boolean) start % 2){
//        		System.out.print(" ");
//        	}
        	System.out.print(start + " ");
        	start--;
        }
 
//		Ange det heltal som du vill räkna ner från: 6
//		6 5 4 3 2 1
        
        /* Returnera lyckad exekvering oavsett hur det faktiskt gick. */
        System.exit(0);
	}
}
