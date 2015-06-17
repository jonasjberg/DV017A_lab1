Laboration 1
============

Redovisning:
------------

Läs igenom hela laborationen innan du börjar. Utöver denna laboration är det
viktigt att du gör så många övningsuppgifter som du hinner i kursboken. Träning
ger färdighet

Laborationen ska redovisas skriftligt med välkommenterad kod. Den måste ha ett
försättsblad.  På försättsbladet ska kursens namn, laboration nummer, ditt
namn, högskolans Email adress och födelsedatum stå.

Laborationen kan lämnas enskilt eller parvis. Lämna in den i Blackboard. Lycka
till!


Uppgifter:
----------

1. I nedanstående program saknas datatyperna (där det står ...) vid
   variabeldeklarationerna. Din uppgift är att fylla i rätt datatyp vid
   respektive deklaration. Provkör sedan programmet:

        public class Datatyper
        {
            public static void main(String[] args)
            {
                ... data1 = true;
                ... data2 = 45.8F;
                ... data3 = 29;
                ... data4 = data3 < 10;
                ... data5 = 12 / 5;
                ... data6 = data3 * data5;
                ... data7 = 10 % 3;
                ... data8 = "Java programmering";
                ... data9 = 'b';
                ... data10 = (float)data5 / 4;
        
                  System.out.println     ("Variabeln     data1: " + data1);
                  System.out.println     ("Variabeln     data2: " + data2);
                  System.out.println     ("Variabeln     data3: " + data3);
                  System.out.println     ("Variabeln     data4: " + data4);
                  System.out.println     ("Variabeln     data5: " + data5);
                  System.out.println     ("Variabeln     data6: " + data6);
                  System.out.println     ("Variabeln     data7: " + data7);
                  System.out.println     ("Variabeln     data8: " + data8);
                  System.out.println     ("Variabeln     data9: " + data9);
                  System.out.println     ("Variabeln     data10: " + data10);
              }
          }


2. Skriv ett program som skriver ut summan, medelvärdet och produkten av tre
   heltal.  De tre heltalen ska användaren skriva in från tangentbordet när
   programmet körs. Programmets utskrift kan t.ex se ut så här, det som skrivs
   in från tangentbordet är markerat med fetstil/understrykning:

        Skriv in tre heltal.
        Skriv in det första talet: *20*
        Skriv in det andra talet: *30*
        Skriv in det tredje talet: *25*
        Summan av talen är 75.
        Medelvärdet av talen är 25.
        Produkten av talen är 15000.



3. Skriv ett program som räknar om mil till kilometer. Användaren ska mata in
   antal mil som ett decimaltal. Sedan ska programmet konvertera till kilometer
   och skriva ut hur många kilometer det blev. Exempel på utskrift, användarens
   inmatning är markerat med fetstil/understrykning:

        Program som konverterar mil till km.
        Skriv in antal mil: *35.4*
        Motsvarande antal km: 354


4. Skriv ett program som frågar efter åldern. Om den inmatade åldern är mindre
   än 0 så ska "Du har matat in fel ålder!" skrivas ut, annars ska "Hej, din XX
   åring!" skrivas ut. Istället för XX ska den ålder stå som skrevs in. Här är
   ett exempel på hur utskriften kan se ut, det som skrivs in från
   tangentbordet är markerat med fetstil/understrykning:

        Hur gammal är du? 28
        Hej, din 28 åring!


5. Skriv ett program där användaren ska skriva in ett heltal. Programmet ska
   sedan skriva ut alla heltal från detta tal ner till ett. Du ska använda dig
   av en while-loop. Exempel på utskrift, användarens inmatning är markerat med
   fetstil/understrykning:

        Ange det heltal som du vill räkna ner från: *6*
        6 5 4 3 2 1


6. Skriv två program som ger samma utskrift som den i uppgift 5, men använd
   istället en for- loop i ena programmet och en do-loop i det andra.


7. Skriv ett program som låter användaren mata in värden till de tre
   heltalsvariablerna var1, var2 och var3. Programmet skall sedan för varje
   påstående a) – e) lagra värdet av påståendet i den booleska variabeln svar
   och därefter skriva ut värdet av svar , försett med lämplig ledtext:

        a) Talet var1 är jämnt delbart med 7.
        b) Talet var3 är inte jämnt delbart med talet var2.
        c) Talet var1 är större än minst något av talen var2 och var3.
        d) Talet var1 är större än talet var2, som i sin tur är större än talet var3.
        e) Talet var1 är större än ett av talen var2 och var3, men inte större än båda.

   Tips: För att kolla om något tal är jämnt delbart med ett annat, använd
   modulus-operatorn %!


8. Skriv ett program som skriver ut en viss multiplikationstabell. Den som kör
   programmet ska ange önskad multiplikationstabell och hur långt programmet ska
   räkna. Exempel på utskrift om man väljer tabell 8 och upp till 4:

        Vilken mulitiplikationstabell önskas? *8*
        Hur långt ska jag räkna? *4*

        8 * 1 = 8
        8 * 2 = 16
        8 * 3 = 24
        8 * 4 = 32


9. Skriv ett program som summerar alla jämna tal från och med 0 t.o.m 200 med
   hjälp av en while-sats och sedan skriver ut denna summa. Skriv sedan två
   program till som utför samma sak, men som istället använder sig av en do-
   resp en for-sats. Observera att du ska skriva de tre programmen utan att
   använda någon if-sats inne i iterations-satserna.


10. Skriv ett program där användaren ska ange ordningsnumret på en månad (1-12).
    Programmet ska sedan skriva ut månadens namn och antal dagar. Om man anger
    felaktigt månadsnummer (mindre än 0 eller större än 12) så ska ett
    felmeddelande skrivas på skärmen, och man ska sedan kunna ange ett nytt
    nummer. Använd switch-sats i din lösning

    Programmet ska fortsätta att fråga efter månadsnummer ända tills man har
    matat in 0 (noll). Då ska programmet avbrytas.

