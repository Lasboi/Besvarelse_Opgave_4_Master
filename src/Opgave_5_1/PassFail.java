package Opgave_5_1;

import java.util.Scanner;

public class PassFail {

    public static void doLoop() { //Vores loop som fortsætter med at køre indtil brugeren skriver -1
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while (score != -1){
            System.out.print("Skriv en Java score: ");
            score = scanner.nextInt();
            if (score > 59 && score < 0) {
                System.out.println("You pass the exam!");
                System.out.println("Skriv -1 for at afslutte programmet");
            }
            else if (score < 60 && score > 0) {
                System.out.println("You failed the exam");
                System.out.println("Skriv -1 for at afslutte programmet");
            }
            else if (score == -1)
            break;
        }
    }

    //Made by metoden fordi det er cool
    static void madeBy() {
        System.out.println("");
        System.out.println("******************************");
        System.out.println("******* Kodet af Lasse *******");
        System.out.println("******************************");
    }

}
