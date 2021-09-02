package List_ex;

import inte.Inter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("신용권",85);
        map.put("홍길동",42);
        map.put("가나다",100);
        map.put("라마사",75);
        map.put("아자차",95);
        System.out.println("총 entry수 : "+map.size());

        System.out.println("\t 홍길동: "+map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t"+key+":"+value);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 entry 수: "+map.size());

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String,Integer>entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t"+key+":"+value);

        }
        System.out.println();

        map.clear();
        System.out.println("총entry: "+map.size());


    }
}
