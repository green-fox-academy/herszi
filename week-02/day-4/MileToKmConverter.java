package scanner;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben

        double MilePerKilometer = 1.61;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * MilePerKilometer;
        System.out.println(miles + " miles is " + kilometers + " kilometers.");

    }
}
