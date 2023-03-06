import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Client {

    private final static int port = 9876;
    private final static String targetHostname = "localhost";

    public static void main(String args[]) throws Exception {

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        System.out.println("UDPClient starting ...");

        // Benutzereingabe abfragen
        System.out.print("Input: ");
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        String sentence = inFromUser.readLine();

        // Socket f�r UDP Kommunikation erzeugen
        DatagramSocket clientSocket = new DatagramSocket();

        // UDP Paket erzeugen und absenden
        InetAddress IPAddress = InetAddress.getByName(targetHostname);
        sendData = sentence.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
        clientSocket.send(sendPacket);

        // UDP Paket vom Server empfangen
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        // Antwort vom Server ausgeben
        String modifiedSentence = new String(receivePacket.getData());
        System.out.println("Answer from Server: " + modifiedSentence);

        // Socket schliessen
        clientSocket.close();

        System.out.println("UDPClient finished.");

    } // main

} // UDPclient

/* ----- End of File ----- */