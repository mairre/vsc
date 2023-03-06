public class Ggt {
    public static void main(String[] args) {
        int a = 60;
        int b = 18;

        // ggt(a, b);
        euklidGgt(a, b);
    }

    public static int ggt(int a, int b) {
        int teiler = a < b ? a : b;

        while (a % teiler != 0 || b % teiler != 0) {
            teiler--;
        }

        return teiler;
    }

    public static int euklidGgt(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return euklidGgt(b, a % b);
        }
    }
}
