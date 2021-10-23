package arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};

        for (int i = 0; i < numList.length; i++) {
            System.out.print((numList[i] = numList[i] * 2) + " ");
        }
    }
}

// - Készíts egy `numList` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
// - Duplázd meg minden elem értéket a tömbben
