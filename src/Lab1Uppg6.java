/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-11
 *  Jonas Sjöberg, Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 6
 */

import java.util.Scanner;

public class Lab1Uppg6 {

    private static final String QUERY = "Ange det heltal som du vill räkna ner från: ";

    public static void main(String[] args) {
		/* Skapa Scanner-objekt för att läsa I/O. Ignorera IDE:ns varningar. */
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        /* Rutinen för att filtrera inmatningen är likadan som i Uppgift #5. 
           För kommentarer rörande rader 25-37, var vänlig se Uppgift #5. */
        int start = -1;

        do {
            System.out.print(QUERY);

            while (!scan.hasNextInt()) {
                System.out.print(QUERY);
                scan.next();
            }

            start = scan.nextInt();

        } while (start <= 0);


        /* Räkna ner från 'start' till 1 med en **for-loop**. */
        System.out.println("\n\nRäknar ner med en \"for\"-loop ..");
        for (int i = start; i > 0; i--) {
            System.out.print(i + " ");
        }        
        
        System.out.println("\n\nRäknar ner med en \"do\"-loop ..");

        /* Räkna ner från 'start' till 1 med en **do-loop**. */
        int i = start;
        do {
            System.out.print(i + " ");
            i--;
		} while (i > 0);


        /* Returnera lyckad exekvering oavsett hur det faktiskt gick. */
        System.exit(0);
    }
}
