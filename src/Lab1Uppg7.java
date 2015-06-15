/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-15
 *  Jonas Sjöberg, Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 7
 */

import java.util.Scanner;

public class Lab1Uppg7 {

    private static boolean svar;

    public static void main(String[] args) {

    System.out.println("Var vänlig mata in heltal för variabler;");
    int var1 = getUserInput("var 1: ");
    int var2 = getUserInput("var 2: ");
    int var3 = getUserInput("var 3: ");


    // a) Talet var1 är jämnt delbart med 7.
    //svar = canDivideEvenly(var1, 7);
    svar = var1 % 7 == 0 ? true : false;

    if (svar) {
    	System.out.println("Talet " + var1 + " är jämnt delbart med 7.");
    } else {
    	System.out.println("Talet " + var1 + " är inte jämnt delbart med 7.");
    }

    // b) Talet var3 är inte jämnt delbart med talet var2.
//    svar = ! canDivideEvenly(var3, var2);
    svar = !(var3 % var2 == 0 ? true : false);

    if (svar) {
    	System.out.println("Talet " + var3 + " är inte jämnt delbart med talet " + var2 + ".");
    } else {
    	System.out.println("Talet " + var3 + " är jämnt delbart med talet " + var2 + ".");
    } 
    
    // c) Talet var1 är större än minst något av talen var2 och var3.
    svar = ((var1 > var2 ? true : false) || (var1 > var3 ? true : false)) ? true : false;

//    System.out.println("var1 > var2 ? " + (var1 > var2 ? "true" : "false"));
//    System.out.println("var1 > var3 ? " + (var1 > var3 ? "true" : "false"));
//    System.out.println("true || true ? " + (true || true ? "true" : "false"));
//    System.out.println("false || true ? " + (false || true ? "true" : "false"));
//    System.out.println("true || false ? " + (true || false ? "true" : "false"));
//    System.out.println("false || false ? " + (false || false ? "true" : "false"));


    if (svar) {
    	System.out.println("Talet " + var1 + " är större än minst något av talen " + var2 + " och " + var3 + ".");
    } else {
    	System.out.println("Talet " + var1 + " är inte större än minst något av talen " + var2 + " och " + var3 + ".");
    }
    
    // d) Talet var1 är större än talet var2, som i sin tur är större än talet var3.
    svar = (var1 > var2 ? true : false) && (var2 > var3 ? true : false);
    if (svar) {
    	System.out.println("d) Talet var1 är större än talet var2, som i sin tur är större än talet var3.");
    }
    
    // e) Talet var1 är större än ett av talen var2 och var3, men inte större än båda.
    svar = (var1 > var2 ? true : false) ^ (var1 > var3 ? true : false);
    if (svar) {
    	System.out.println("Talet var1 är större än ett av talen var2 och var3, men inte större än båda.");
    }


/*
  7. Skriv ett program som låter användaren mata in värden till de tre
     heltalsvariablerna var1, var2 och var3. Programmet skall sedan för varje
     påstående a) – e) lagra värdet av påståendet i den booleska variabeln svar
     och därefter skriva ut värdet av svar , försett med lämplig ledtext:

      a) Talet var1 är jämnt delbart med 7.
      b) Talet var3 är inte jämnt delbart med talet var2.
      c) Talet var1 är större än minst något av talen var2 och var3.
      d) Talet var1 är större än talet var2, som i sin tur är större än talet var3.
      e) Talet var1 är större än ett av talen var2 och var3, men inte större än båda.

     Tips: För att kolla om något tal är jämnt delbart med ett annat,
           använd modulus-operatorn %!
*/



    }

    private static boolean canDivideEvenly(int n1, int n2) {
    	return n1 % n2 == 0 ? true : false;
    }
    
    
    /**
     * getUserInput
     * Hämtar ett positivt heltal från användaren.
     *
     * @return ett positivt heltal från användaren.
     */
    protected static int getUserInput(String query) {
        /* Skapa Scanner-objekt för att läsa I/O. Ignorera IDE:ns varningar. */
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        /* Rutinen för att filtrera inmatningen är likadan som i Uppgift #5. */
        int start = -1;

        do {
            System.out.print(query);

            while (!scan.hasNextInt()) {
                System.out.print(query);
                scan.next();
            }

            start = scan.nextInt();

        } while (start <= 0);

        /* Returnera inmatat positivt heltal. */
        return start;
    }

}
