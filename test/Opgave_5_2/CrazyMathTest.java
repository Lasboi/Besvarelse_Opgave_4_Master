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

    //Test Case - Genere 5 tal
    //Input number = 0
    //Forventet output: 5 tilfældige tal mellem 1-12

    public void testFiveRandomNumbers() {
        int totalNumbers = 0;
        int number = 0;
        int i = 0;

        while (i != 5) {
            number = (int)(Math.random() * 12 + 1);
            System.out.println(number);
            totalNumbers++;
            i++;
        }
        assertEquals(5, totalNumbers);
    }

    //Test case - Rigtigt svar
    //Input: sum1 = 5, sum2 = 10
    //Forventet output: answer = 50

    public void testMathLogic() {
        int sum1 = 5;
        int sum2 = 10;
        int answer = 50;

        answer = sum1 * sum2;
        assertEquals(50, answer);
    }

}