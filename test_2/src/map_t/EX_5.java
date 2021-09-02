package map_t;

import java.util.HashMap;
import java.util.Scanner;

public class EX_5 {
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("나라이름과 인구를 입력하시오");
        while(true){
            System.out.println("나라이름 , 인구>>");
            String nation = sc.next();
        if (nation.equals("그만"))
            break;
        int population = sc.nextInt();
        nations.put(nation, population);
    }
        while(true){
            System.out.println("인구검색>>");
            String nation = sc.next();
            if(nation.equals("그만")){
                break;
            }
            Integer n = nations.get(nation);
            if(n ==null) {
                System.out.println(nation + "나라는 없엉용");
            }else{
                System.out.println(nation+"의 인구는 "+n);
            }
            sc.close();
        }
    }

}
