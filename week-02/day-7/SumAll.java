package arrays;

public class SumAll {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        System.out.println("A tömb összes elemének az összege: " + sum);

    }
}

// - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
// - Írasd ki a konzolra a `numbers` tömb összes elemének összegét
