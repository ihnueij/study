package Ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{
    int aa=11;
    String bb="azaz";
}

public class HashSetExample1 {
    public static void main(String[] args) {
//		Set<String> set = new  HashSet<String>(); 20번 때문에 오브젝트타입으로 선언해줌
        Set<Object> set = new HashSet<>();

        set.add("java");
//		set.add("java");//중복을 허용하지 않기 때문에 총갯수는 4개만 나온다
        set.add("JDBC");
        set.add("Servalet/Jsp");
        set.add("iBATIS");
        AA a = new AA();
        set.add(a);

        int size = set.size();
        System.out.println("총객체수>>"+ size);

        Iterator<Object> iterator = set.iterator();

        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");
        System.out.println("총객체수>>"+set.size());//삭제

        for(Object object : set) {
            System.out.println(object);
        }
        if (set.isEmpty()) {
            System.out.println("비어있음");
        }else {
            System.out.println("객체있음");
        }
        set.clear();// 다 비우기
        if (set.isEmpty()) {
            System.out.println("비어있음");
        }else {
            System.out.println("객체있음");
        }

    }
}
