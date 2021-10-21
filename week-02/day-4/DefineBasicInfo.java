package valiables;

public class DefineBasicInfo {
    public static void main(String[] args) {
        // Hozz létre pár dolgot változóként és utána írasd ki az értékeiket:
        // - A neved karakterláncként (string)
        // - Korod egész számként (integer)
        // - Magasságod méterben törtszámként (float / double)
        // - Házas vagy-e logikai értékként (boolean)

        String name = "Szilvia";
        System.out.println("Name: " + name);
        int age = 38;
        System.out.println("Age: " + age);
        double height = 1.66;
        System.out.println("Height: " + height + "m");
        boolean maritalStatus = false;
        System.out.println("Marital Status: " + maritalStatus);
    }
}
