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


        System.out.println("for-loop:");
        for (int i = start; i > 0; i--) {
            System.out.print(i + " ");
        }        
        
        System.out.println("\n\ndo-loop:");
        
        int i = start;
        do {
            System.out.print(i + " ");
            i--;
		} while (i > 0);

        int j = start;
        System.out.println("\n\nwhile-loop:");
        while (j > 0) {
//        	if ((boolean) start % 2){
//        		System.out.print(" ");
//        	}
            System.out.print(j + " ");
            j--;
        }


//		Ange det heltal som du vill räkna ner från: 6
//		6 5 4 3 2 1

        /* Returnera lyckad exekvering oavsett hur det faktiskt gick. */
        System.exit(0);
    }
}
