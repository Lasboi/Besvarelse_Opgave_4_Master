package Opgave_5_2;

import java.util.Scanner;

public class CrazyMath {

    static final int numberOfQuestions = 10;
    static int correctCount = 0;
    static int count = 0;
    static long startTime = System.currentTimeMillis();
    static String output = " ";

    static void Setup() {
        Scanner scanner = new Scanner(System.in);

        while (count > numberOfQuestions) {
            int number1 = (int)(Math.random() * 12 + 1);
            int number2 = (int)(Math.random() * 12 + 1);
        }
    }

}
