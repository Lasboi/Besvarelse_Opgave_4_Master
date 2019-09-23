package Opgave_5_4;

import junit.framework.TestCase;

public class ConverterTest extends TestCase {

    //Test case - Loop som kører 10 gange
    //Input i = 0
    //Forventet output: i = 10

    public void testLoop() {
        int i = 0;
        while ( i < 10) {
            System.out.println(i);
            i++;
        }
        assertEquals(10, i);
    }

    //Test case - Inch til Cm
    //Input: inch = 1
    //Forventet output: centimeter = 2.54

    public void testInchToCentimeter(){

    }

}