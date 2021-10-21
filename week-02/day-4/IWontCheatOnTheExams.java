package loops;

public class IWontCheatOnTheExams {
    public static void main(String[] args) {
        // Írj egy programot ami 100-szor kiírja:
        // "Nem fogok csalni az a vizsgán!"

        String text = "Nem fogok csalni az a vizsgán!";
        int a = 0;
        while (a < 100) {
            System.out.println(text);
            a++;
        }
    }
}
