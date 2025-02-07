import java.io.*;
import java.net.*;

public class MultiplayerGameServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Multiplayer Game Server Started...");
        while (true) {
            Socket player = server.accept();
            new Thread(() -> handlePlayer(player)).start();
        }
    }

    private static void handlePlayer(Socket player) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(player.getInputStream()));
            String move = reader.readLine();
            System.out.println("Player Move: " + move);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
