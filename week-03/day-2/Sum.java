package funcions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Adjál meg egy számot!");
        Scanner scanner = new Scanner(System.in);
        int szam = scanner.nextInt();
        System.out.println("A számok összege 0-tól a megadott számig:");

        System.out.println(sum(szam));
    }

    public static int sum(int a) {
        int summa = 0;
        for (int i = 0; i <= a; i++) {
            summa = summa + i;
        }
        return summa;
    }

}

// - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.

// - Készíts egy függvényt `sum` névvel mely összeadja a számokat
//   nullától a bemeneti paraméterig és visszaadja azok összegét.
