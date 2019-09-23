package Opgave_5_2;

import java.util.Scanner;

public class CrazyMath {

    static final int numberOfQuestions = 10; //Det antal spørgsmål vi ønsker at stille
    static int correctCount = 0; //Det korrekte antal spørgsmål man har svaret på
    static int count = 0; //Hvor mange spørgsmål vi har stillet
    static long startTime = System.currentTimeMillis(); //Starttiden på når programmet starter
    static String output = " "; //Output vi benytter til sidst til at skrive ud hvad man har svaret

    static void Setup() {
        Scanner scanner = new Scanner(System.in);

        while (count < numberOfQuestions) {
            //Vi genere 2 random tal
            int number1 = (int)(Math.random() * 12 + 1); //Vi generere et tal mellem 1-12
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
                correctCount++; //Vi tæller antal korrekt svar op
            }
            else {
                System.out.println("Dit svar er desværre forkert.");
                System.out.println("Det rigtige svar er: " + number1*number2);
            }

            count++;

            //Vi laver en string hvor vi for hver gang loopet kører tilføjer en ny linje med udregnening og svaret
            output += "\n" + number1 + " * " + number2 + " = " + answer +
                    ((number1 * number2 == answer) ? " Korrekt": " Forkert"); //Vi tjekker om svaret passer

        }
    }


    //Vi bruger denne metode til at udregne tiden der er gået fra man startede og holde styr på hvad man
    //Har svaret rigtigt på
    static void TimeGenerator() {

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Du har svaret rigtigt på " + correctCount + ". \nTesten tog dig "
        + testTime / 1000 + " sekunder at fuldføre." + output);

    }

}
