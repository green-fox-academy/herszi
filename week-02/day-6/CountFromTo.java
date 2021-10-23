package loops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Készíts egy programot, ami két számot kér
        // Ha a második szám nem nagyobb, mint az első, írja ki:
        // "A második számnak nagyobbnak kellene lennie!"
        //
        // Amennyiben nagyobb,
        // az első számtól kezdve el kellene számolnia egyesével a másodikig
        //
        // Például:
        //
        // első szám: 3, második szám: 6, ezt kellene printelnie:
        //
        // 3
        // 4
        // 5

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjál meg két számot!\nElső szám: ");
        int userInput1 = scanner.nextInt();
        System.out.println("Második szám: ");
        int userInput2 = scanner.nextInt();
        if (userInput1 >= userInput2) {
            System.out.println("A második számnak nagyobbnak kellene lennie!");
        } else {
            int a = userInput1;
            while (a < userInput2) {
                System.out.print(a + " ");
                a++;
            }
        }
    }
}
