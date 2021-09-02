package Thre;

public class ThreadMainEx {
    public static void main(String[] args) {
        String name =Thread.currentThread().getName();
        long id =Thread.currentThread().getId();
        int priority =Thread.currentThread().getPriority();
        Thread.State s =Thread.currentThread().getState();

        System.out.println("현재실행중인 스레드이름>>"+name);
        System.out.println("현재실행중인 스레드 아이디>>"+id);
        System.out.println("현재실행중인 스레드 우선순위>>"+priority);
        System.out.println("현재실행중인 스레드 상태>>"+s);


    }
}
