package Thre;

class TimerThread extends Thread {

    int n = 0;

    public void run() {
        while (true) {
            System.out.println("TimerThread running");
//			System.out.println(n);
//			n++;
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//
//			}
        }

    }
}
public class TestThread extends Thread{
    public static void main(String[] args) {
        TimerThread th = new TimerThread();
        th.start();
        while(true) {
            System.out.println("main thread running");
        }
    }
}
