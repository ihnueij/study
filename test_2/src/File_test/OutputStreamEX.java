package File_test;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamEX {
    public static void main(String[] args) {
        try {
            OutputStream op = new FileOutputStream("C:\\Users\\sjinc\\IdeaProjects\\test_2\\out\\production\\test_2\\Output.txt");
            String str = "안녕하세용 파일테스트 입니당";
            byte[] by = str.getBytes();
            op.write(by);
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
