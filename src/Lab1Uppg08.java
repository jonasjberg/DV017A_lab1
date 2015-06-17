/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-15
 *  Jonas Sjöberg 860224
 *  Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 8
 */

import java.util.Scanner;

public class Lab1Uppg08 {

	public static void main(String[] args) {

		int multTable;
		int countToNumber;
		
		/* Hämta information från användaren. */
		multTable = getUserInput("Vilken multiplikationstabell önskas? ");
		countToNumber = getUserInput("Hur långt ska jag räkna? ");
		
		/* Utför beräkning och skriv ut resultat. 
		 * For-loopen exekverar en gång per uträkning och utskriftsrad. */
		for (int i = 1; i <= countToNumber; i++) {

			int result = multTable * i;
			System.out.println(multTable + " * " + i + " = " + result);

		}
		
	}
/*  
   Vilken mulitiplikationstabell önskas? *8*
   Hur långt ska jag räkna? *4*

   8 * 1 = 8
   8 * 2 = 16
   8 * 3 = 24
   8 * 4 = 32
    
   */
	
    /**
     * getUserInput
     * Hämtar ett positivt heltal från användaren.
     * Textsträngen 'query' skrivs ut tills dess att användaren matat in ett 
     * positivt heltal.
     
     * @return ett positivt heltal från användaren.
     */
    protected static int getUserInput(String query) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int input = -1;

        do {
            System.out.print(query);

            while (!scan.hasNextInt()) {
                System.out.print(query);
                scan.next();
            }

            input = scan.nextInt();

        } while (input <= 0);

        return input;
    }

	
	
}
