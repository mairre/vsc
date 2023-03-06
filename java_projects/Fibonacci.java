import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Geben Sie eine Zahl an:");
            int number = scanner.nextInt();

            for (int i = 0; i <= number; i++) {
                System.out.println("fibonacci(" + i + ") = " + fibonacci(i));
            }
        }
    }

    private static int fibonacci(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
