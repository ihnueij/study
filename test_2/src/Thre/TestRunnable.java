package Thre;


class TimerRunnable implements Runnable{
    int n =0;
    public void run() {
        while(true) {
            System.out.println("timerRunable running");
/*			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
        }

    }
}
public class TestRunnable {
    public static void main(String[] args) {
        Thread th = new Thread (new TimerRunnable());
        th.start();
        while(true) {
            System.out.println("main thread running");
        }
    }
}
