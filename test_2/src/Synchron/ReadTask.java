package Synchron;

public class ReadTask implements Runnable{

    private ScoreBoard scoreBoard =null;

    public ReadTask(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    @Override
    public void run() {
        while (scoreBoard.score < 5){
            readScore();
        }
    }
    public synchronized void readScore(){
        synchronized (scoreBoard){
            System.out.println("읽을때 점수 : "+scoreBoard.score);
        }
    }
}
