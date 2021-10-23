package loops;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Találd ki az egyjegyű számot! ");

        int Input = scanner.nextInt();
        if (Input == number) {
            System.out.println("Eltaláltad a számot");
        } else if (Input < number) {
            System.out.println("A tárolt szám nagyobb");
        } else {
            System.out.println("A tárolt szám kisebb");
        }
    }
}


// Írj egy programot ami tárol egy számot és
// a felhasználónak kell kitalálnia azt.
// A felhasználó találgathat és
// minden standard input-ba beírt szám után
// a programnak ki kell írnia egyet ezek közül:
//
// A tárolt szám nagyobb
// A tárolt szám kisebb
// Eltaláltad a számot