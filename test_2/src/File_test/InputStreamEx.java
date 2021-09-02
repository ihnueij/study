package File_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamEx {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\sjinc\\IdeaProjects\\test_2\\out\\production\\test_2\\Output.txt");
            FileReader f_reader = new FileReader(file);
            int cur = 0;
            while ((cur = f_reader.read()) != -1) {
                System.out.println((char) cur);
            }
            f_reader.close();
        }catch (FileNotFoundException e){
            e.getStackTrace();
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
