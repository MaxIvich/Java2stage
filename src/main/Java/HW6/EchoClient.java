package HW6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    final String EXIT_MESSAGE = "/end";


    public static void main(String[] args) {
        new EchoClient().start();
    }

    private void start() {

        try {
            openConnection();
            Scanner scanner = new Scanner(System.in);
            while (!socket.isOutputShutdown()){
                sendMessage(scanner.nextLine());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void sendMessage(String message) throws InterruptedException {

        try {

            out.writeUTF(message);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void openConnection() throws IOException {
        socket=new Socket("127.0.0.1",9198);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(()->{
            try {
                while (true) {
                    String message = in.readUTF();
                    if(EXIT_MESSAGE.equalsIgnoreCase(message)){
                        break;
                    }
                    System.out.println("Сообщение от сервера:  " + message);



                }
            } catch (IOException e ) {
                e.printStackTrace();
            } finally {
                closeConnection();
            }

        }).start();


    }

    public boolean finish(String s){
        return s.equalsIgnoreCase(EXIT_MESSAGE);

    }
    private void closeConnection() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(socket != null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


