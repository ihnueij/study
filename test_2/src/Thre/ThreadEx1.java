package Thre;

class ThreadEx1_1 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("i: "+i);
        }

    }
}
class ThreadEx1_2 implements Runnable{
    @Override
    public void run() {
        for(int j=10; j<15; j++) {
            System.out.println("j: "+j);
        }
    }
}
public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();
//		Thread t2 = new Thread(new ThreadEx1_2()); 26,27번을 한줄로 표현한것!
        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();


    }
}
