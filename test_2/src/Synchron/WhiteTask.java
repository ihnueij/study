package Synchron;

public class WhiteTask implements Runnable {
    private ScoreBoard scoreBoard=null;

    public WhiteTask(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    @Override
    public void run() {
        while (scoreBoard.score < 5 ){
            writeScore();
        }
    }
    public void writeScore(){
        synchronized (scoreBoard){
            System.out.println("올린 점수 :"+(++scoreBoard.score));
        }
    }
}
