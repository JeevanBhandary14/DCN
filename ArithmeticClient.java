import java.io.*;
import java.net.*;

// ArithmeticClient
class ArithmeticClient {
    public static void main(String arg[]) {
        try (Socket sc = new Socket("localhost", 9999);
             DataInputStream dis = new DataInputStream(sc.getInputStream());
             DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(dis.readUTF());
            dos.writeInt(Integer.parseInt(br.readLine()));

            System.out.println(dis.readUTF());
            dos.writeInt(Integer.parseInt(br.readLine()));

            System.out.println(dis.readUTF());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}