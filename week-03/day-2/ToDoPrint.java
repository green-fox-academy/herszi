package stringmethods;

public class ToDoPrint {
    public static void main(String... args) {
        String todoText = " - Buy milk\n";

        todoText = "My todo:".concat("\n").concat(todoText).concat(" - Download games\n").concat("\t - Diablo");

        // Add hozzá a "My todo:" szöveget a todoText szövege elejéhez.
        // Add hozzá a " - Download games" szöveget a todoText szöveg végéhez.
        // Add hozzá a " - Diablo" szöveget a todoText szöveg végéhez,
        // de behúzással.

        // Várt eredmény:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}
