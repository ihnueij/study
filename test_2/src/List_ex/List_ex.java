package List_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ex {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("홍길동");
        list.add("가나다");
        list.add(new String("오리지널"));

        list.add(1,"1번째");

        String element0 = list.get(0).toString();
        String element1 = list.get(1).toString();
        String element2 = list.get(2).toString();

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String element = (String)iterator.next();
        }
        for(Object object : list){
            String element = (String) object;
        }
        int index = list.indexOf("홍길동");
        list.add(index,"홍길동 앞에 값 추가");

        System.out.println(list.contains("홍길동"));

        System.out.println(list.remove(0));
        System.out.println(list.remove("홍길동"));
    }
}
