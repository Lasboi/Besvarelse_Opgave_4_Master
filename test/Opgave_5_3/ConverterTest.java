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

}