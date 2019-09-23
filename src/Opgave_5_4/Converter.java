package Opgave_5_4;

public class Converter {

    //Vores setup metoden som køre hele programmet
    static void Setup() {
        int inches = 1;
        double centimeter;

        System.out.println("Inches      Centimeter");

        while (inches != 11) { //Vi kører vores loop 10 gange (1-10)
            centimeter = ((double) inches) * 2.54; //Vi udregner fra inches til cm
            System.out.println(" " + inches + "     |    " + centimeter);
            inches++;
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
