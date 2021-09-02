package map_t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex_3 {
    public static void main(String[] args) {
        String[] s = {"강아지","고양이","호랑이"};
        ArrayList<String>list = new ArrayList<>(Arrays.asList("개미","개미"));
        System.out.println(list);

        List<String> al = new ArrayList<>(list);
        System.out.println("nCopies : "+al);

        Collections.fill(al,"벌");
        System.out.println("벌을 채운후: "+al);

        Collections.addAll(al,s);
        System.out.println("리스트를 모두 추가한후: "+al);

        Collections.shuffle(al);
        System.out.println("리스트를 섞은 후: "+al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("리스트를 역순으로 정리한후: "+al);

        System.out.println("리스트에서최소 : "+Collections.min(al));
        System.out.println("리스트에서 최대 : "+Collections.max(al));
        System.out.println("리스트에서 '벌'의 빈도 : "+Collections.frequency(al,"벌"));


    }
}
