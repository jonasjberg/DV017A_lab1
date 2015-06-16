/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-09
 *  Jonas Sjöberg 860224-7614
 *  Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 4
 */

import java.util.Scanner;

public class Lab1Uppg04 {

    public static void main(String[] args) {
        /* Skapa Scanner-objekt för att läsa I/O. Ignorera IDE:ns varningar. */
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int age = 0;

        do {
        /* Loopa tills 'age' är nollskiljd och positiv. */
        System.out.print("Hur gammal är du? ");

            while (!scan.hasNextInt()) {
                /* Loopa tills nästa "token" i scan's lista går att parsea till en
                 * int. Avgränsare mellan "tokens" är whitespace som standard,
                 * där whitespace är mellanslag och andra tecken som motsvarar
                 * tomt vertikalt eller horisontellt utrymme i text.
                 */
                System.out.println("Hur gammal är du?");
                scan.next();
            }

            /* Scan måste hålla en int i sin "lista" som är OK att använda. */
            age = scan.nextInt();

        } while (age <= 0);

        System.out.println("Hej, din " + age + "-åring!");
    }
}
