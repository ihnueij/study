package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServerSocket listener=null;
        Socket socket=null;

        try {
            listener = new ServerSocket(5896);//포트를 만들어줘야 연결이 가능
            System.out.println("연결을 기다리고있습니다...");
            socket = listener.accept();
            System.out.println("연결되었습니다.");


            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//들어오는거
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//나가는것

            while(true) {//한번만주고받고하는것이 아니기때문에 반복문으로 해준다
                String inputMessage =  in.readLine();

                if(inputMessage.equals("bye")) {//반복문 종료를 위한 if문
                    System.out.println("클라이언트에서 bye로 연결을 종료하였음.");
                    break;
                }
                System.out.println("클라이언트>> "+ inputMessage);
                System.out.println("보내기>>");
                String outputMessage = sc.nextLine();
                out.write(outputMessage+"\n");
                out.flush();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {//종료할때도 오류가 날수도 있기때문에 또 트라이 해준다
            try {
                sc.close();//나중에 연거부터 닫는다
                socket.close();
                listener.close();
            } catch (Exception e2) {
                System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
            }
        }
    }
}
