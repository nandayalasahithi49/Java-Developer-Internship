
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            PrintWriter output =
                    new PrintWriter(socket.getOutputStream(), true);

            output.println("Hello Server!");
            output.println("This is Task 3 Chat Application");

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
