package stringmethods;

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";


        String firstPart = quote.substring(0, 21);
        String secondPart = quote.substring(21);

        quote = firstPart.concat("always takes longer than").concat(" ").concat(secondPart);

        // Az idézet mentésekor lemezhiba történt. Kérlek, javítsd ki.
        // Add hozzá az "always takes longer than"-t a StringBuilder (quote) -hoz
        // az "It" és a "you" szó közzé.
        // Használd a quote változó darabjait(a String újra definiálása helyett).

        System.out.println(quote);
    }
}
