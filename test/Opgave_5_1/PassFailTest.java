package Opgave_5_1;

import junit.framework.TestCase;

public class PassFailTest extends TestCase {

    //Test case - Pass
    //Input: 70
    //Forventet output "You pass the exam"
    public void testPass() {
        int score = 75;
        String result;

        if (score > 59)
            result = "You pass the exam";
        else
            result = "You fail the exam";

        assertEquals("You pass the exam", result);
    }

    //Test case - Fail
    //Input: 50
    //Forventet output: "You fail the exam"
    public void testFail() {
        int score = 50;
        String result;

        if (score > 59)
            result = "You pass the exam";
        else
            result = "You fail the exam";

        assertEquals("You fail the exam", result);
    }
}