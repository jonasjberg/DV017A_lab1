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

public class Lab1Uppg07 {

    private static boolean svar;

    public static void main(String[] args) {

    System.out.println("Var vänlig mata in heltal för variabler var1, var2 och var3;");
    int var1 = getUserInput("var1: ");
    int var2 = getUserInput("var2: ");
    int var3 = getUserInput("var3: ");


    // a) Talet var1 är jämnt delbart med 7.
//    svar = var1 % 7 == 0 ? true : false;
    svar = var1 % 7 == 0;
    
    System.out.println("a) Talet " + var1 + " är jämnt delbart med 7? " + svar);


    // b) Talet var3 är inte jämnt delbart med talet var2.
//    svar = !(var3 % var2 == 0 ? true : false);
    svar = !(var3 % var2 == 0);
    
    System.out.println("b) Talet " + var3 + " är inte jämnt delbart med talet " + var2 + "? " + svar);

    
    // c) Talet var1 är större än minst något av talen var2 och var3.
//    svar = ((var1 > var2 ? true : false) || (var1 > var3 ? true : false)) ? true : false;
    svar = (var1 > var2) || (var1 > var3);
    
    System.out.println("c) Talet " + var1 + " är större än minst något av talen " + var2 + " och " + var3 + "? " + svar);

    
    // d) Talet var1 är större än talet var2, som i sin tur är större än talet var3.
//    svar = (var1 > var2 ? true : false) && (var2 > var3 ? true : false);
    svar = (var1 > var2) && (var2 > var3);
    
    System.out.println("d) Talet " + var1 + " är större än talet " + var2 + ", som i sin tur är större än talet " + var3 + "? " + svar);

    
    // e) Talet var1 är större än ett av talen var2 och var3, men inte större än båda.
//    svar = (var1 > var2 ? true : false) ^ (var1 > var3 ? true : false);
    svar = (var1 > var2) ^ (var1 > var3);
    
    System.out.println("e) Talet " + var1 + " är större än ett av talen " + var2 + " och " + var3 + ", men inte större än båda? " + svar);


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
     * Textsträngen 'query' skrivs ut tills dess att användaren matat in ett 
     * positivt heltal.
     *
     * @return ett positivt heltal från användaren.
     */
    protected static int getUserInput(String query) {
        /* Skapa Scanner-objekt för att läsa I/O. Ignorera IDE:ns varningar. */
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        /* Rutinen för att filtrera inmatningen är likadan som i Uppgift #5. */
        int input = -1;

        do {
            System.out.print(query);

            while (!scan.hasNextInt()) {
                System.out.print(query);
                scan.next();
            }

            input = scan.nextInt();

        } while (input <= 0);

        /* Returnera inmatat positivt heltal. */
        return input;
    }

}
