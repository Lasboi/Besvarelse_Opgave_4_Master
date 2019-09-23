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

        while (count < numberOfQuestions) {
            //Vi genere 2 random tal
            int number1 = (int)(Math.random() * 12 + 1);
            int number2 = (int)(Math.random() * 12 + 1);

            //Hvis det andet tal er højere end det første bytter vi dem om for at det er nemmere
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.print("Hvad er " + number1 + " * " + number2 + "? ");
            int answer = scanner.nextInt();

            if (number1 * number2 == answer) {
                System.out.println("Du har ret!");
                correctCount++;
            }
            else {
                System.out.println("Dit svar er desværre forkert.");
                System.out.println("Det rigtige svar er: " + number1*number2);
            }

            count++;

        }
    }

    static void TimeGenerator() {

        long endTime = System.currentTimeMillis();

    }

}
