package loops;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy számot: ");
        int Input = scanner.nextInt();
        for (int i = 0; i < Input; i++) {
            System.out.print("%");
        }
        System.out.println();

        String elso = "";
        String masodik = "";
        String szokoz = " ";

        int a = 0;
        for (int i = 0; i < (Input - 2); i++) {
            for (int j = (Input - 3 - a); j > 0; j--) {
                masodik = masodik + szokoz;
            }
            System.out.println("%" + elso + "%" + masodik + "%");
            elso = elso + szokoz;
            masodik = "";
            a++;
        }
        for (int i = 0; i < Input; i++) {
            System.out.print("%");
        }
    }
}
// Írj egy programot, ami egy számot kér a standard input-ból és egy
// ilyen négyzetet rajzol::
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// A négyzetnek annyi sora legyen,
// mint amennyi az inputból kiolvasott szám értéke
