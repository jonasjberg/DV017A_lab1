/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-09
 *  Jonas Sjöberg 860224
 *  Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 2
 */

import java.util.Scanner;

public class Lab1Uppg02 {

    /* Konstant värde, typ #define i C-liknande språk med en pre-processor.
     * ITERATIONS är antalet tal som ska matas in. Konstant vid exekvering. */
    private static final int ITERATIONS = 3;

    /* Svenska Räkneord i string-arrays. Arrayindex överenstämmer med talet. */
    private static final String[] GRUNDTAL = { "noll", "ett", "två", "tre",
                                               "fyra", "fem", "sex", "sju",
                                               "åtta", "nio", "tio", "osv" };

    private static final String[] ORDNINGSTAL = { "nollte", "första", "andra",
                                                  "tredje", "fjärde", "femte",
                                                  "sjätte", "sjunde", "åttonde",
                                                  "nionde", "tionde", "osv" };


    public static void main(String[] args) {
        /* Deklarara variabler och nytt Scanner-objekt för att läsa I/O. */
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int input, sum = 0;
        double average = 0;
        long product = 1; /* Kan räkna med att produkten kan bli väldigt stor */

        /* Fråga efter 'ITERATIONS' antal tal. Pussla ihop strängar och hämta
         * svenska räkneord från arrayen 'GRUNDTAL'. */
        System.out.println("Skriv in " + GRUNDTAL[ITERATIONS] + " heltal.");

        /* Loopa 'ITERATIONS' gånger, fråga efter talen i sekventiell följd.
         * Om noll heltal efterfrågas avslutas programmet direkt. */
        for (int i = 1; i < ITERATIONS + 1; i++) {
            System.out.print("Skriv in det " + ORDNINGSTAL[i] + " talet: ");

            input = scan.nextInt();

            sum += input;
            average = sum / i;
            product = product * input;
        }

        /* Skriv ut resultatet till stdout. */
        System.out.println("Summan av talen är "      + sum
                       + "\nMedelvärdet av talen är " + average
                       + "\nProdukten av talen är "   + product);
    }
}
