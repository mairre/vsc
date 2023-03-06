import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Automarken {
    public static void main(String[] args) {
        List<String> marken = new ArrayList<>();
        marken.add("Audi");
        marken.add("BMW");
        marken.add("Ford");
        marken.add("Kia");
        marken.add("Seat");

        Iterator<String> iter = marken.iterator();

        while (iter.hasNext()) {
            String marke = iter.next();
            if (marke.equals("Kia")) {
                iter.remove();
                System.out.println("Alles klar, " + marke + " wurde entfernt");
            }
            System.out.println(marke);
        }

        System.out.println("----------------------------------------");

        for (String marke : marken) {
            System.out.println(marke);
        }
    }
}
