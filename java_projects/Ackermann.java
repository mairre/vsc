import java.util.Scanner;

public class Ackermann {
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Gebe sie bitte die erste Zahl ein:");
            int x = scanner.nextInt();

            System.out.println("Gebe sie bitte die zweite Zahl ein:");
            int y = scanner.nextInt();

            System.out.println("ackermann(" + x + "," + y + ")=" + ackermannFct(x, y));
        }
    }

    public static long ackermannFct(long n, long m) {
        if (n == 0)
            return m + 1;
        else

        if (m == 0)
            return ackermannFct(n - 1, 1);
        else
            return ackermannFct(n - 1, ackermannFct(n, m - 1));

    }
}
