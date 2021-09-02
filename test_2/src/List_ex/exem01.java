package List_ex;

import java.util.ArrayList;
import java.util.List;

public class exem01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("java");
        list.add("jdbc");
        list.add("jsp");
        list.add(2,"database");
        list.add("html");

        int size = list.size();
        System.out.println("총 객체수: "+size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2 :"+skill);
        System.out.println();

        for (int i = 0; i<list.size(); i++){
            String str = list.get(i);
            System.out.println(i+":"+str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("html");

        for(int i =0; i <list.size(); i++){
            String str = list.get(i);
            System.out.println( i + ":" +str);
        }

    }
}
