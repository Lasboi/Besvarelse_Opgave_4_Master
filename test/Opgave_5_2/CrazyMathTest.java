package Opgave_5_2;

import junit.framework.TestCase;

public class CrazyMathTest extends TestCase {

    //Test Case - Gange 2 tal sammen
    //Input: sum1 = 5, sum2 = 10
    //Forventet output: 50

    public void testMultiplication() {
        int sum1 = 5;
        int sum2 = 10;

        int result = sum1 * sum2;
        assertEquals(50, result);
    }

}