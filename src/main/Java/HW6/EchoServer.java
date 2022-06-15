package HW6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    final  static String EXIT_MESSAGE = "/end";
    private DataOutputStream out;
    private DataInputStream in;
    private Socket socket;

    public static void main(String[] args) {
        new EchoServer().go();

    }
    public void go () {
           start();


    }

    public void start(){
        try (ServerSocket serverSocket = new ServerSocket(9198)) {
            System.out.println("Ждем подключения клиента....");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился ...");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            while (!socket.isOutputShutdown()) {
                String message = in.readUTF();
                if (EXIT_MESSAGE.equals(message)) {
                    out.writeUTF(EXIT_MESSAGE);
                    closeConnection();

                    break;
                }

                System.out.println("Сообщение от пользователя:  " + message);

                new Thread(()->{
                    while (true) {
                        Scanner scanner = new Scanner(System.in);
                        String s = scanner.nextLine();
                        try {
                            out.writeUTF(s);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

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









