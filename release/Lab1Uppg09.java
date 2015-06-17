/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-15
 *  Jonas Sjöberg 860224
 *  Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 9
 */

public class Lab1Uppg09 {
	
	/* Tal att räkna upp till. */
	private static final int UPPER_LIMIT = 200;


	public static void main(String[] args) {
	
	/* #1. Använder 'WHILE'-sats. */
	int number = UPPER_LIMIT;
	int sum = 0;
	
	/* Använder 'number' som loop-räknare. Flyttar över 2 från 'number' till 
	 * 'sum' per iteration. */
	while (number > 0) {
		sum += number;
		
		number -= 2;
	}
	
	System.out.println("\n#1. Använder 'WHILE'-sats. ");
	System.out.println("Summan av alla jämna tal från 0 till " + UPPER_LIMIT +
				       " = " + sum);
	

	/* #2. Använder 'DO'-sats. */
	number = UPPER_LIMIT;
	sum = 0;

	/* Använder 'number' som loop-räknare. Flyttar över 2 från 'number' till 
	 * 'sum' per iteration. */
	do {
		sum += number;
		number -= 2;
	} while (UPPER_LIMIT > 2 && number > 0);

	System.out.println("\n#2. Använder 'DO'-sats. ");
	System.out.println("Summan av alla jämna tal från 0 till " + UPPER_LIMIT +
				       " = " + sum);
	
	
	/* #3. Använder 'FOR'-sats. */
	number = UPPER_LIMIT;
	sum = 0;
	
	/* Skippar initialisering inuti 'for'-loopen, tomt före första semikolon. */
	for (; number > 0; number -= 2) {
		sum += number;
	}

	System.out.println("\n#3. Använder 'FOR'-sats. ");
	System.out.println("Summan av alla jämna tal från 0 till " + UPPER_LIMIT +
				       " = " + sum);
		
/*
   9. Skriv ett program som summerar alla jämna tal från och med 0 t.o.m 200 med
   hjälp av en while-sats och sedan skriver ut denna summa. Skriv sedan två
   program till som utför samma sak, men som istället använder sig av en do-
   resp en for-sats. Observera att du ska skriva de tre programmen utan att
   använda någon if-sats inne i iterations-satserna.

 */
	}

}
