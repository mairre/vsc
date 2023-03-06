import java.util.Scanner;

public class tuermeVonHanoi {
    static int tries = 0;

    public static void main(String[] args) {
        System.out.println("Gib Anzahl Stapel an: ");
        Scanner scanner = new Scanner(System.in);
        int anzahlStapel = scanner.nextInt();
        scanner.close();

        System.out.println("-----------------------------------------");

        moves('a', 'b', 'c', anzahlStapel);
        System.out.println("");
        System.out.println("Anzahl Bewegungen: " + tries);
        System.out.println("");
    }

    public static void moves(char a, char b, char c, int n) {
        if (n == 1) {
            int steps = tries + 1;
            System.out.println("Schritt " + steps + " von " + a + " -> " + c);
            tries++;
        } else {
            moves(a, c, b, n - 1);
            moves(a, b, c, 1);
            moves(b, a, c, n - 1);
        }
    }
}
