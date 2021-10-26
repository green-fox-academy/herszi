package stringmethods;

public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");

        String firstPart = url.substring(0, 5);
        String secondPart = url.substring(5);
        url = firstPart.concat(":").concat(secondPart);


        // Véletlenül rossz URL-t kaptam egy vicces subreddithez.
        // Valószínűleg ez "odds" és nem "bots" akart lenni.
        // Továbbá az URL-ből hiányzik egy fontos rész, derítsd ki
        // melyik az és illeszd be.
        // Próbáld meg megoldani többféleképpen különböző String függvényekkel.

        System.out.println(url);
    }
}
