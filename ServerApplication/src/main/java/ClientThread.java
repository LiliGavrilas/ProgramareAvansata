import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class ClientThread  extends Thread {
    private Socket socket = null;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {


        try {
            // Get the request from the input stream: client → server
            BufferedReader in = null;///flux de intrare (care pot fi binar sau tex) aici is in octeti

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());///construieste fluxl de iesire
            while(true) {


                String request = in.readLine();///citim o comanda de la client
                System.out.println(request);

                if (request.equals("STOP")) {
                    GameServer.serverIsRunning = false;
                    String raspuns = "Server stopped\n";
                    out.println(raspuns);
                    out.flush();
                } else {
                    String raspuns = "Server received the request " + request;
                    out.println(raspuns);
                    out.flush();
                }
            }
            // Send the response to the oputput stream: server → client

           // String raspuns = "Hello " + request + "!";///pregateste raspunsul
            //out.println(raspuns);//triitem raspunsul
            //out.flush();///daca e comunicare de lunga durata flush e crucial, altfel daca e de scurta durata avem close din finally
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
        } finally {
            try {
                socket.close(); // or use try-with-resources
            } catch (IOException e) {
                System.err.println(e);
            }
        }

    }
}
