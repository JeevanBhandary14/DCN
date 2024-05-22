   import java.io.*;
import java.net.*;

// ArithmeticServer
class ArithmeticServer {
    public static void main(String arg[]) {
        try (ServerSocket ss = new ServerSocket(9999)) {
            System.out.println("Server Listening at " + InetAddress.getLocalHost().getHostAddress() +
                    " at port " + ss.getLocalPort());

            try (Socket sc = ss.accept();
                 DataInputStream dis = new DataInputStream(sc.getInputStream());
                 DataOutputStream dos = new DataOutputStream(sc.getOutputStream())) {

                dos.writeUTF("Enter the first number:");
                int a = dis.readInt();

                dos.writeUTF("Enter the Second number:");
                int b = dis.readInt();

                int c = a + b;
                dos.writeUTF("The sum is: " + c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}