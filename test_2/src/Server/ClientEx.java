package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Socket socket=null;

        try {
            socket =new Socket("localhost",5896);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//나가는것

            while(true) {
                System.out.print("보내기>>");
                String outputMessage = sc.nextLine();

                if(outputMessage.equals("bye")) {
                    out.write(outputMessage);
                    out.flush();
                    break;
                }
                out.write(outputMessage+"\n");
                out.flush();
                String inputMessage=in.readLine();
                System.out.println("서버: "+inputMessage);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                sc.close();
                socket.close();
            } catch (Exception e2) {
                System.out.println("연결중 오류가 발생했습니다.");
            }
        }
    }
}
