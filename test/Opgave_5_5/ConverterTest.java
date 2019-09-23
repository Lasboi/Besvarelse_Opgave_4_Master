package Opgave_5_5;

import junit.framework.TestCase;


public class ConverterTest extends TestCase {

    //Test case - F til C
    //Input: c = 0
    //Forventet output: F = 32.000

    public void testConventionToC() {
        double c = 0.000;
        double f = 0;

        f = (c * 9 / 5) + 32;
        double fRound = Math.round(f * 1000.0) / 1000.0; //Vi sætter vores resultat ned til 3 decimaler
        assertEquals(32.000, fRound);
    }

    //Test case - C til F
    //Input: f = 20
    //Forventet output: c = -6.667
    public void testConventionToF() {
        double c = 0;
        double f = 20.000;

        c = (f - 32) / 1.8;
        double cRound = Math.round(c * 1000.0) / 1000.0; //Vi sætter vores resultat ned til 3 decimaler
        assertEquals(-6.667, cRound);
    }

}