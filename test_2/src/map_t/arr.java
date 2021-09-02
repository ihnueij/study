package map_t;

import java.util.Hashtable;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Hashtable<String,Integer>map = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        map.put("홍길일",100);
        map.put("홍길둘",90);
        map.put("홍길삼",80);
        map.put("홍길사",70);
        map.put("홍길오",60);

        System.out.println("이름을임력해");
        String keyName = sc.next();

        System.out.println(map.get(keyName));
    }
}
