
import java.util.Scanner;

public class Zeichen_Uebung1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben sie einen Character ein:");
        String cString = s.nextLine();
        s.close();

        isPalindrom(cString.toLowerCase());

        // stringInvert(cString);
        // stringToChar(cString);
        // isUpperCaseLetter(cString.charAt(0));
        // isLowerCaseLetter(cString.charAt(0));
    }

    private static boolean isPalindrom(String str) {
        String revStr = stringInvert(str);
        Boolean isPal = str.matches(revStr);

        if (isPal) {
            System.out.println(str + " is a Palindrom");
        } else {
            System.out.println(str + " is not a Palindrom");
        }

        return isPal;
    }

    private static String stringInvert(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str);

        String revStr = input.reverse().toString();

        System.out.println(str + " --> " + revStr);
        return revStr;
    }

    public static void stringToChar(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }

    public static void isUpperCaseLetter(char c) {
        if ('\u0041' <= c && c <= '\u005A') {
            System.out.println("Character " + c + " is upper case letter");
        } else
            System.out.println("Character " + c + " is not upper case letter");
    }

    public static void isLowerCaseLetter(char c) {
        if ('\u0061' <= c && c <= '\u007A') {
            System.out.println("Character " + c + " is lower case letter");
        } else
            System.out.println("Character " + c + " is not lower case letter");
    }
}
