package Opgave_5_3;

import junit.framework.TestCase;

public class ConverterTest extends TestCase {

    //Test case - Loop 50 gange
    //Input: i = 0
    //Forventet output: i = 50

    public void testLoop() {
        int i = 0;
        while (i < 50) {
            //System.out.println(i);
            i++;
        }
        assertEquals(50, i);
    }

    //Test case - F til C
    //Input: c = 0
    //Forventet output: F = 32.0

    public void testConvention() {
        double c = 0;
        double f = 0;

        f = (c * 9 / 5) + 32;

        assertEquals(32.0, f);
    }

}