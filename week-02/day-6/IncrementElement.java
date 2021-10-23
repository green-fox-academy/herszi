package arrays;

public class IncrementElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        numbers[2] += 7;
        System.out.println("A tömb harmadik eleme: " + numbers[2]);
    }
}

// - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[1, 2, 3, 4, 5]`
// - Növeld a harmadik elem értékét (pl.: eggyel)
// - Írasd ki a konzolra a `numbers` nevű tömb harmadik elemét
