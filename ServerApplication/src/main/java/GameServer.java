import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class GameServer {
    public static final int PORT = 8100;
    public static Boolean serverIsRunning = true;

    public GameServer() throws IOException {

        ServerSocket serverSocket = null ;
        try {
            serverSocket = new ServerSocket(PORT);
            while(serverIsRunning)///serverul asteapta req de la client
            {
                System.out.println ("Waiting for a client ...");
                Socket socket=serverSocket.accept();
                //Socket socket1=serverSocket.accept();//accept este blocant= serverul se blocheaza in asteptarea unui client
                //Socket socket2=serverSocket.accept();
                // Execute the client's request in a new thread
                new ClientThread(socket).start();//se deblocheaza accept =>avem client si ne ocupam de el

            }
        }catch (IOException e) {
            System.err. println ("Ooops... " + e);
        }finally {
            serverSocket.close();
        }
    }
    public static void main ( String [] args ) throws IOException {
        GameServer gameServer= new GameServer();
    }
}
