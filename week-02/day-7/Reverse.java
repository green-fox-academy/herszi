package arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7};

        int[] swap = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            swap[3 - i] = numbers[i];
        }
        for (int i = 0; i < 4; i++) {
            numbers[i] = swap[i];
            System.out.print(numbers[i] + " ");
        }
    }
}

// - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
// - Fordítsd meg az elemek sorrendjét a `numbers` tömbben
// - Írasd ki a konzolra a `numbers` tömb megfordított sorrendű elemeit