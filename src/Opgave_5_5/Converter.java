package Opgave_5_5;

public class Converter {

    //Vores setup metoden som køre hele programmet
    static void Setup() {
        int celsius1 = 0;
        double fahrenheit1 = 0;
        double celsius2 = 0;
        int fahrenheit2 = 20;
        int i = 0;

        System.out.println(" C    F        F      C");

        while (i != 51) { //Vi kører vores loop 50 gange
            fahrenheit1 = (((double) celsius1 * 9 / 5)) + 32; //Vi udregner fra celsius til fahrenheit
            celsius2 = ((double) fahrenheit2 - 32) / 1.8; //Vi udregner fra fahrenheit til celsius
            double celsius2Round = Math.round(celsius2 * 1000.0) / 1000.0; //Vi sætter vores resultat ned til 3 decimaler
            System.out.println(" " + celsius1 + "   " + fahrenheit1 + "  |  " + fahrenheit2 + "   " + celsius2Round);
            celsius1 = celsius1 + 2; //Vi tæller celsius1 op med 2 hver gang loopet kører
            fahrenheit2 = fahrenheit2 + 5; //Vi tæller fahrenheit2 op med 5 hver gang loopet kører
            i++; //Vi tæller i op med 1 så vi kan styrre hvor mange gange vores loop skal kører
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
