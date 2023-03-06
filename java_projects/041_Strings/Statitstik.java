import java.io.*;
import java.util.Scanner;

public class Statitstik {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Menü:");
		System.out.println("1 = gutenberg_faust.txt");
		System.out.println("2 = palindrome.txt");
		System.out.println("3 = small_1000.txt");
		System.out.println("");
		System.out.println("Geben sie eine Zahl ein:");
		int chose = s.nextInt();
		s.close();

		switch (chose) {
			case 1:
				statistik("/Users/renemair/Desktop/Rene/dev/texts/gutenberg_faust.txt");
				break;
			case 2:
				statistik("/Users/renemair/Desktop/Rene/dev/texts/palindrome.txt");
				break;
			case 3:
				statistik("/Users/renemair/Desktop/Rene/dev/texts/small_1000.txt");
				break;

			default:
				System.out.println("Auswahl ist nicht gültig!!!");
				break;
		}
	}

	public static void statistik(String filename) throws IOException {
		// Teilsumme in Prozent
		double checkNum = 0.00;
		double checkLet = 0.00;
		// Das Zählerarray für die Anzahl der Buchstaben
		int[] counter = new int[26];
		// Initialisieren mit 0
		for (int i = 0; i < 26; ++i) {
			counter[i] = 0;
		}
		// Das Zählerarray für die Anzahl der Zahlen
		int[] count = new int[26];
		// Initialisieren mit 0
		for (int i = 0; i < 10; ++i) {
			count[i] = 0;
		}

		FileReader reader = new FileReader(filename);
		// Ein Zwischenspeicher fürs Einlesen der Datei
		char[] buffer = new char[1024];
		// Eine Zählervariable für die Gesamtzahl der eingelesenen Zeichen
		int n;
		// Solange noch Daten gelesen werden können, weiterlesen
		while ((n = reader.read(buffer)) > 0) {
			// Durch den Zwischenspeicher iterieren
			for (int i = 0; i < n; ++i) {
				// Kleinbuchstaben
				if (buffer[i] >= 'a' && buffer[i] <= 'z') {
					// Den Wert im Zählerarray erhöhen
					++counter[buffer[i] - 'a'];
				}
				// Großbuchstaben
				else if (buffer[i] >= 'A' && buffer[i] <= 'Z') {
					// Den Wert im Zählerarray erhöhen
					++counter[buffer[i] - 'A'];
				}
				// Zahlen
				else if (buffer[i] >= '0' && buffer[i] <= '9') {
					// Den Wert im Zählerarray erhöhen
					++count[buffer[i] - '0'];
				}
			}
		}
		reader.close();
		// Variable für die Gesamtzahl der eingelesenen Buchstaben (nicht Textzeichen
		// allgemein...)
		int N = 0;
		// Variable für die Gesamtzahl der eingelesenen Zahlen
		int Z = 0;
		// Summieren der Zählerwerte Zahlen
		for (int i = 0; i < 10; ++i) {
			Z += count[i];
		}
		// Summieren der Zählerwerte Buchstaben
		for (int i = 0; i < 26; ++i) {
			N += counter[i];
		}
		System.out.println("==========Zahlen=========");
		for (int i = 0; i < 10; ++i) {
			// Kontrolle für Prozent:
			checkNum += (count[i] * 100.0) / (N + Z);
			// Ausgabe der Ergebnisse:
			// Formatierte Ausgabe

			System.out.printf(
					// Formatstring
					"%c: %7d     (%6.2f%%)",
					// Der aktuelle Buchstabe
					(char) (i + '0'),
					// Absolute Anzahl
					count[i],
					// Prozentuale Anzahl
					(count[i] * 100.0) / (N + Z));
			// Neue Zeile
			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.printf("Zwischensumme: (%6.2f%%)", checkNum);
		System.out.println("");
		System.out.println("========Buchstaben=======");
		for (int i = 0; i < 26; ++i) {
			// Kontrolle für Prozent:
			checkLet += (counter[i] * 100.0) / (N + Z);
			// Ausgabe der Ergebnisse:
			// Formatierte Ausgabe
			System.out.printf(
					// Formatstring
					"%c: %7d     (%6.2f%%)",
					// Der aktuelle Buchstabe
					(char) (i + 'A'),
					// Absolute Anzahl
					counter[i],
					// Prozentuale Anzahl
					(counter[i] * 100.0) / (N + Z));
			// Neue Zeile
			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.printf("Zwischensumme: (%6.2f%%)", checkLet);
		System.out.println("");
		System.out.println("-------------------------");
		System.out.printf("Summe:         (%6.2f%%)", checkNum + checkLet);
		System.out.println("");
		System.out.println("=========================");
	}
}
