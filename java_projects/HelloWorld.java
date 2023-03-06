import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hallo type your name:");

        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            helloWorldExtended(name);
        }
    }

    public static void helloWorldExtended(String name) {
        System.out.println("Hello World, My name is " + name);
    }
}