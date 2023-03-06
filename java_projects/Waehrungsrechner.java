import java.util.Scanner;

public class Waehrungsrechner {
    public static void main(String[] args) {
        initial();
    }

    public static void initial() {
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("Menü:");
        System.out.println("------------------------------------------------------");
        System.out.println("1 EUR->CHF, 2 CHF->EUR");
        System.out.println("------------------------------------------------------");
        System.out.println("Wählen sie aus dem Menü aus:");

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        System.out.println("Geben sie den Betrag ein: ");
        double amount = scanner.nextDouble();
        scanner.close();

        System.out.println("");
        change(choose, amount);
    }

    public static void change(int choose, double amount) {
        if (choose <= 2) {
            switch (choose) {
                case 1:
                    double resChf = eurChf(amount);
                    System.out.println("Für " + amount + " EUR bekommt man " + resChf + " CHF");
                    break;
                case 2:
                    double resEur = chfEur(amount);
                    System.out.println("Für " + amount + " CHF bekommt man " + resEur + " EUR");
                    break;

                default:
                    break;
            }
        } else {
            System.out.println("Bitte eine gültige Auswahl treffen");
        }

    }

    public static double eurChf(double amount) {
        double exchangeRate = 0.95;
        return amount * exchangeRate;
    }

    public static double chfEur(double amount) {
        double exchangeRate = 1.05;
        return amount * exchangeRate;
    }

}
