/* 
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-09
 *  Jonas Sjöberg, Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *  
 *  Labb #1
 *  Uppgift 2
 */

import java.util.Scanner;

public class Lab1Uppg2 {
	
	/* Konstant värde, typ #define i C-liknande språk med en pre-processor. 
	 * ITERATIONS är antalet tal som ska matas in. Konstant vid exekvering. */
	private static final int ITERATIONS = 9;
	private static final String[] TALORD_OBES = { "noll", "ett", "två", "tre",
											      "fyra", "fem", "sex", "sju",
											      "åtta", "nio", "tio", "osv" };

	private static final String[] TALORD_BEST = { "nollte", "första", "andra", 
											      "tredje", "fjärde", "femte",
											      "sjätte", "sjunde", "åttonde",
											      "nionde", "tionde", "osv" };

	public static void main(String[] args) {
		/* Deklarara variabler och nytt Scanner-objekt för att läsa I/O. */
		Scanner scan = new Scanner(System.in);
		int input, sum = 0;
		double average = 0;
		long product = 1; /* Kan räkna med att produkten kan bli väldigt stor */
		
		/* Fråga efter 'ITERATIONS' antal tal. Pussla ihop strängar och hätma 
		 * tal från arrayen 'TALORD_OBES'. */
		System.out.println("Skriv in " + TALORD_OBES[ITERATIONS] + " heltal.");
		
		/* */
		for (int i = 1; i < ITERATIONS + 1; i++) {
			System.out.print("Skriv in det " + TALORD_BEST[i] + " talet: ");
			input = scan.nextInt();
			
			sum += input;
			//System.out.println("Sum: " + sum);

			average = sum / i;
			
			//System.out.println("Average: " + average);

			product = product * input;
			//System.out.println("Product: " + product);
		}
		
		System.out.println("Summan av talen är " 	  + sum
					   + "\nMedelvärdet av talen är " + average
					   + "\nProdukten av talen är "   + product);
		
		
//		Skriv in tre heltal.
//		Skriv in det första talet: 20
//		Skriv in det andra talet: 30
//		Skriv in det tredje talet: 25
//		Summan av talen är 75.
//		Medelvärdet av talen är 25.
//		Produkten av talen är 15000.
	}

}
