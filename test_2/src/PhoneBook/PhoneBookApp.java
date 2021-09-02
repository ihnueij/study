package PhoneBook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookApp {
    final  int  insert=0;
    final  int  delete=1;
    final  int  search=2;
    final  int  allnum=3;
    final  int  exit=4;

    private Scanner sc;

    HashMap<String, Phone> map = new HashMap<String, Phone>();
    private String name, telnum,address;
    public PhoneBookApp(){
        sc = new Scanner(System.in);
    }
    public void run(){
        while(true){
            System.out.println("-------------------------------");
            System.out.println("추가0| 삭제1| 찾기2 | 전체보기 3 | 종료 4");
            System.out.println("번호로입력하시오=> ");
            int menu = sc.nextInt();
            switch (menu){
                case insert: insert(); break;
                case delete: delete(); break;
                case search: search(); break;
                case allnum: allnum(); break;
                case exit:
                    System.out.println("프로그램을 종료합니다."); return;
            }
        }
    }
    public void insert(){
        System.out.println("이름: ");
        name = sc.next();
        if(map.get(name) != null ){
            System.out.println("이미존재하는 이름이에오..");
            return;
        }
        System.out.println("전화번호: ");
        telnum = sc.next();
        System.out.println("주소:" );
        address = sc.next();

        map.put(name,new Phone(name, telnum,address));
    }
    public void delete(){
        System.out.println("이름: ");
        name = sc.next();
        if(map.get(name) != null ){
            System.out.println("존재하지 않는 이름이에오..");
            return;
        }
        map.remove(name);
    }
    public void search(){
        System.out.println("이름: ");
        name = sc.next();
        if(map.get(name) != null ){
            System.out.println("존재하지 않는 이름이에오..");
            return;
        }
        Phone p = map.get(name);
        System.out.println(p.toString());
    }
    public void allnum(){
        Set<String> keylist = map.keySet();
        Iterator<String> itr = keylist.iterator();
        while (itr.hasNext()){
            String name = itr.next();
            System.out.println(map.get(name));
        }
    }

    public static void main(String[] args) {
        PhoneBookApp pb =  new PhoneBookApp();
        pb.run();
    }

}
