import java.util.Scanner;

public class FormatierungUebung2 {
    public static void main(String[] args) {
        System.out.println("Nächste Runde: Y/N?");
        try (Scanner scNext = new Scanner(System.in)) {
            String next = scNext.next().toUpperCase();

            if (next == "Y") {
                nextValue();
            } else {
                return;
            }
        }
    }

    public static void nextValue() {
        System.out.println("Geben sie bitte eine Ganzzahl ein:");
        try (Scanner scValue = new Scanner(System.in)) {
            int value = scValue.nextInt();

            formatDez(value);
            formatHex(value);
            formatOkt(value);

            // iteration();
        }
    }

    public static void formatDez(int value) {
        System.out.format("Dezimal: %1$+014d \n", value);
        ;
    }

    public static void formatHex(int value) {
        System.out.format("Hexadezimal: 0x%1$08x \n", value);
        ;
    }

    public static void formatOkt(int value) {
        System.out.format("Oktazahl: %1$013o \n", value);
        ;
    }
}
