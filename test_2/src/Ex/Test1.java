package Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> ff = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");

        int max=0;

        for(int i =0; i <4; i++) {
            String s = sc.next();
            ff.add(s);
        }
        for(int i =0; i <4; i++) {
            if(ff.get(max).length()< ff.get(i).length()) {
                max = i;
            }

        }
        System.out.println("가장긴이름은"+ff.get(max));

    }
}
