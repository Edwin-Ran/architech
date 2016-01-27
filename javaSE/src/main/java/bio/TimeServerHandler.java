package bio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * Created by haoranchen on 2016/1/22.
 */
public class TimeServerHandler implements Runnable {

    Socket socket = null;

    public TimeServerHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            out = new PrintWriter(this.socket.getOutputStream(),true);
            String currentTime = null;
            String body = null;

            while((body = in.readLine()) != null) {
                System.out.println("The time server receive order:" + body);
                currentTime = System.currentTimeMillis() + "";

                out.println(body + " " + currentTime);
            }
        } catch (Exception e) {

        }
    }
}
