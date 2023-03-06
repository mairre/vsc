import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Gleitkomma_Uebung1 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            // Eingabe des Kapitals
            System.out.println("Geben sie das Startkapital ein:");
            double kapitalWert = s.nextDouble();

            // Eingabe der Zinsen
            System.out.println("Geben sie die Zinsen ein:");
            double zinsWert = s.nextDouble();

            // Eingabe der Laufzeit
            System.out.println("Geben sie die Laufzeit ein:");
            int laufZeit = s.nextInt();
            s.close();
            ZinsesZins(kapitalWert, zinsWert, laufZeit);
        }
    }

    private static void ZinsesZins(double kapitalWert, double zinsWert, int laufZeit) {
        DecimalFormat decf = new DecimalFormat("###,##0.00",
                new DecimalFormatSymbols(new Locale("pt", "BR")));
        DecimalFormat intf = new DecimalFormat("00");
        int i = 1;

        System.out.println("========================================================");
        System.out.println("Zinseszins Rechner");
        System.out.println("========================================================");

        while (i <= laufZeit) {
            double kapital = kapitalWert * Math.pow(1 + zinsWert / 100.0, i);
            kapital = Math.round(20.0 * kapital) / 20.0;

            System.out.println("Das Kapital am Ende des "
                    + intf.format(i) + ". Jahres beträgt " + decf.format(kapital) + " CHF");
            i += 1;
        }
        System.out.println("--------------------------------------------------------");
    }

    public static void Uebung1() {
        float a = 0.0f;
        int i = 1;

        while (i < 10) {
            a = a + 1.0f / i;
            i += 1;
        }
    }

    public static void Uebung2() {
        double a = 0.0;
        int i = 1;

        while (i < 5) {
            a = a + 1.0 / i;
            i += 1;
        }

        System.out.println(a);
    }

    public static void Uebung3() {
        double a = 0.0;

        do {
            a = a + 0.1;
            System.out.println(a);
        } while (a != 1.0);
    }
}
