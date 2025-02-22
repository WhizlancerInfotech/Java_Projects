import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started...");
        Socket socket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String clientMessage;
        while ((clientMessage = in.readLine()) != null) {
            System.out.println("Client: " + clientMessage);
            String response = keyboard.readLine();
            out.println(response);
        }
        serverSocket.close();
    }
}
