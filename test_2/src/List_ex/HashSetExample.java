package List_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("jsp");
        set.add("jdbc");
        set.add("java");
        set.add("java");

        int size = set.size();
        System.out.println("총객체수: "+size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t"+element);
        }
        set.remove("jdbc");
        set.remove("jsp");

        System.out.println("총객체수:"+set.size());

        iterator = set.iterator();
        for(String element : set){
            System.out.println("\t"+element);
        }

        set.clear();
        if(set.isEmpty()){
            System.out.println("비어있음");
        }
    }
}
