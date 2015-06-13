/*
 *  DV017A :: Grundläggande programmering i Java
 *  ============================================
 *  Uppdaterad 2015-06-13
 *  Jonas Sjöberg, Högskolan i Gävle.
 *  <tel12jsg@student.hig.se>
 *
 *  Labb #1
 *  Uppgift 6
 */


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Lab1Uppg6Test extends TestCase {
/*
   Source:
   http://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
 */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    Lab1Uppg6 uppg6 = new Lab1Uppg6();

    @Before
    //public void setUpStreams() {
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    //public void cleanUpStreams() {
    public void tearDown() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void out() {
        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }

    @Test
    public void err() {
        System.err.print("hello again");
        assertEquals("hello again", errContent.toString());
    }


    @Test
    public void testCountDownUsingForLoop() {

        int input[] = { 1, 2, 3, 4, 5};

        for (int i = 0; i < input.length; i++){

           uppg6.countDownUsingForLoop (i);
           //System.out.println("input[" + i + "]: " + i);
           //System.out.println("outContent.toString(): " + outContent.toString());

           String expect = " " + input[i] + " ";
           //System.out.print(expect);
           assertEquals(expect, outContent.toString());
        }
    }
}