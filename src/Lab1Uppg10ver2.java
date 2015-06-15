/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-15
 *  Jonas Sjöberg, Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 10
 */

import java.util.Scanner;

public class Lab1Uppg10ver2 {
	
	/* Array håller namn för månader, textsträng i array index [0] har ett
	 * "dummy"-/placeholder-värde 'NULL' så att månad #1 hamnar på array-index #1.*/
	private static final String[] MONTH_NAMES = 
		{ "NULL", "Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", 
		  "Augusti", "September", "Oktober", "November", "December" };

	/* Array av integers för antal dagar för månad. Arrayindex [0] håller ett
	 * "dummy"-/placeholder-värde '0' så att respektive månads ordningsnummer
	 * sammanfaller med array-index.*/
	private static final int DAYS_IN_MONTH[] = 
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	/* Textsträng som skrivs ut för att prompta användaren om inmatning. */
	private static final String QUERY = "Ange ordningsnumret på en månad (1-12)"
			                          + " \n.. eller (0) för att avsluta: ";


	public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int input;

		/* "Huvud-loop" start. Loopa så länge användaren inte matar in '0'. */
		do {

			input = -1;

			do {
				/* Fråga användaren efter inmatning. */
				System.out.print(QUERY);

				/* Fortsätt fråga efter inmatning tills dess att scan "håller"
				 * en int redo för inläsning. Använd next() för att kassera och
				 * gå vidare till nästa tecken, avskiljt med whitespace. */
				while (!scan.hasNextInt()) {
					System.out.print(QUERY);
					scan.next();
				}

				/* Scan har hittat en int. */
				input = scan.nextInt();

				/* Fortsätt fråga om inmatningen är ogiltlig. */
			} while (input < 0 || input > 12);

			/* Om användaren matat in '0', avsluta programmet genom att hoppa ur
			 * "huvud"-DO-loopen med 'break'. */
			if (input == 0) {
				break;
			}

			/* Skriv ut månadens namn och antal dagar. */
			System.out.println(MONTH_NAMES[input] + " har "
					+ DAYS_IN_MONTH[input] + " dagar.\n");

		} while (input != 0);
		/* "Huvud-loop" slutar här. */
/*
10. Skriv ett program där användaren ska ange ordningsnumret på en månad (1-12).
    Programmet ska sedan skriva ut månadens namn och antal dagar. Om man anger
    felaktigt månadsnummer (mindre än 0 eller större än 12) så ska ett
    felmeddelande skrivas på skärmen, och man ska sedan kunna ange ett nytt
    nummer. Använd switch-sats i din lösning

    Programmet ska fortsätta att fråga efter månadsnummer ända tills man har
    matat in 0 (noll). Då ska programmet avbrytas.
*/
		
		System.out.println("Avslutar ..");
        /* Returnera lyckad exekvering oavsett hur det faktiskt gick. */
		System.exit(0);
	}
}
