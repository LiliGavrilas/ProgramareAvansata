import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import static java.lang.System.exit;

public class GameClient {
    public static void main (String[] args) throws IOException {
        String serverAddress = "127.0.0.1"; // The server's IP address

        int PORT = 8100; // The server's port
        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);

                BufferedReader in = new BufferedReader (
                        new InputStreamReader(socket.getInputStream())) ) {
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                String request = obj.readLine();

                if (request.equals("Exit")) {
                    exit(0);
                } else {
                    out.println(request);
                    out.flush();
                }

                // Send a request to the server
                // String request = "World";
                // out.println(request);
                // Wait the response from the server ("Hello World!")
                String response = in.readLine();
                System.out.println(response);
            }
        } catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);
        }

    }

}
