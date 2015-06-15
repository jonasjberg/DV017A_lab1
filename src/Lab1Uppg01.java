/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-09
 *  Jonas Sjöberg, Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 1
 */

public class Lab1Uppg01 {
    public static void main(String[] args) {
        boolean data1 = true;
        float data2 = 45.8F;
        int data3 = 29;
        boolean data4 = data3 < 10;

        /* Även om data5 skulle vara av typen double som klarar decimaltal,
         * så är 12 och 5 båda av typen int per default och decimaldelen
         * går förlorad. Därmed kan data5 ha typen 'int. */
        int data5 = 12 / 5;

        /* Då varken data3 eller data5 är decimaltal kan int också användas. */
        double data6 = data3 * data5;

        int data7 = 10 % 3;
        String data8 = "Java programmering";
        char data9 = 'b';
        float data10 = (float) data5 / 4;

        System.out.println("Variabeln data1:  " + data1
                       + "\nVariabeln data2:  " + data2
                       + "\nVariabeln data3:  " + data3
                       + "\nVariabeln data4:  " + data4
                       + "\nVariabeln data5:  " + data5
                       + "\nVariabeln data6:  " + data6
                       + "\nVariabeln data7:  " + data7
                       + "\nVariabeln data8:  " + data8
                       + "\nVariabeln data9:  " + data9
                       + "\nVariabeln data10: " + data10);
    }
}
