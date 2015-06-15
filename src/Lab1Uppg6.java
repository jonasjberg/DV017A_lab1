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
        int start = getUserInput();

        /* Räkna ner från 'start' till 1 med en **DO-loop**. */
        System.out.println("\n\nRäknar ner med en \"do\"-loop ..");
        countDownUsingDoLoop(start);

        /* Räkna ner från 'start' till 1 med en **FOR-loop**. */
        System.out.println("\n\nRäknar ner med en \"for\"-loop ..");
        countDownUsingForLoop(start);

        /* Returnera lyckad exekvering oavsett hur det faktiskt gick. */
        System.exit(0);
    }

    /**
     * Räkna ner från 'start' till 1 med en **for-loop**.
     * @param start startvärde att börja räkna ner ifrån
     */
    protected static void countDownUsingForLoop(int start)
    {
        for (int i = start; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    /**
     * Räkna ner från 'start' till 1 med en **do-loop**.
     * @param start startvärde att börja räkna ner ifrån
     */
    protected static void countDownUsingDoLoop(int start)
    {
        int i = start;
        do {
            System.out.print(i + " ");
            i--;
        } while (i > 0);
    }

    /**
     * getUserInput
     * Hämtar ett positivt heltal från användaren.
     *
     * @return ett positivt heltal från användaren.
     */
    protected static int getUserInput() {
        /* Skapa Scanner-objekt för att läsa I/O. Ignorera IDE:ns varningar. */
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        /* Rutinen för att filtrera inmatningen är likadan som i Uppgift #5. */
        int start = -1;

        do {
            System.out.print(QUERY);

            while (!scan.hasNextInt()) {
                System.out.print(QUERY);
                scan.next();
            }

            start = scan.nextInt();

        } while (start <= 0);

        /* Returnera inmatat positivt heltal. */
        return start;
    }
}

