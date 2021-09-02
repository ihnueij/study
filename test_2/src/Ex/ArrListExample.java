package Ex;

import java.util.ArrayList;
import java.util.List;

public class ArrListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("JDBC");
        list.add("Servlet/jsp");
        list.add(2,"database");// 번호를 2번으로 지정했기 때문에 2번이다
        list.add("spring");

        int size = list.size();//list의 크기
        System.out.println("총list갯수>>"+size);

        String skill = list.get(2);
        System.out.println("2번째인덱스>>"+skill);

        String skill2 = list.get(3);
        System.out.println("3번째인덱스>>"+skill2);

        String skill3 = list.get(4);
        System.out.println("4번째인덱스>>"+skill3);

        for (int i = 0; i<list.size(); i++) {
            String str = list.get(i);
            System.out.println(i+": "+str);

        }

        System.out.println();
        list.remove(2); //2번의 인덱스를 삭ㅈㅔ해준다

        for (int i = 0; i<list.size(); i++) {// 삭제 됐는지 알아보기 위해서
            String str = list.get(i);
            System.out.println(i+": "+str);

        }
        System.out.println();
        list.remove("spring"); // 인덱스값을 입력해도 삭ㅈㅔ해준다

        for (int i = 0; i<list.size(); i++) {// 삭제 됐는지 알아보기 위해서
            String str = list.get(i);
            System.out.println(i+": "+str);

        }


    }
}
