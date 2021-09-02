package Synchron;

public class RunClass {
    public static void main(String[] args) {
        Cup cup = new Cup();

        SingleThread task = new SingleThread(cup);

        Thread people1 = new Thread(task,"people1");
        Thread people2 = new Thread(task,"people2");

        people1.start();
        people2.start();
    }
}
