package funcions;

import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        System.out.println("Adjál meg egy számot!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("A szám faktoriálisa:");

        System.out.println(factorio(number));
    }

    public static int factorio(int a) {
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac = fac * i;
        }
        return fac;
    }
}

// - Hozz létre egy class-t `Factorio` névvel és benne a main függvényt.

// - Készíts egy függvényt `factorio` névvel,
//   mely visszaadja a bemeneti paraméter faktoriális értékét.
