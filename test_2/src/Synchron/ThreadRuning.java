package Synchron;

public class ThreadRuning {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        WhiteTask whiteTask = new WhiteTask(scoreBoard);
        ReadTask readTask = new ReadTask(scoreBoard);

        Thread people1 = new Thread(whiteTask, "write People");
        Thread people2 = new Thread(readTask, "read People");

        people1.start();
        people2.start();
    }
}
