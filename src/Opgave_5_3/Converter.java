package Opgave_5_3;

public class Converter {

    //Vores setup metoden som køre hele programmet
    static void Setup() {
        double celsius = 0;
        double fahrenheit = 0;

        System.out.println("Celsius      Fahrenheit");

        while (celsius != 101) { //Vi kører vores loop 101 gange (0-100)
            fahrenheit = (celsius * 9 / 5) + 32; //Vi udregner fra celcius til fahrenheit
            System.out.println(" " + celsius + "     |       " + fahrenheit);
            celsius++;
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
