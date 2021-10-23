package loops;

public class DrawChessTable {
    public static void main(String[] args) {
        String paratlan = "% % % %";
        String paros = " % % % %";

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println(paratlan);
            } else {
                System.out.println(paros);
            }
        }
    }
}

// Írj egy programot, ami egy ilyen "sakktáblát" rajzol ki:
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
