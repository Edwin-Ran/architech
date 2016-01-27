package bio;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by haoranchen on 2016/1/22.
 */
public class TimeServer {
    public static void main(String[] args) {
        int port;

        if(args != null) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (Exception e){
                port = 8080;
            }
        } else {
            port = 8080;
        }

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("The time server is start in port:" + port);
            Socket socket = null;
            while(true) {
                socket = serverSocket.accept();
                new Thread(new TimeServerHandler(socket)).start();
            }
        } catch (Exception e) {

        } finally {
            if(serverSocket != null) {
                System.out.println("The time server close!");
                try {
                    serverSocket.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
