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

        /* Att 'start' får värdet -1 gör ingen faktiskt skillnad eftersom att
         * 'scan' garanterar att den inre while-loopen inte avslutas förrän
         * 'start' faktiskt håller en integer och do-loopens conditional kan
         * utvärderas säkert.
         */
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

        /* Returnera inmatat positivt heltal. */
        return start;
    }
}

