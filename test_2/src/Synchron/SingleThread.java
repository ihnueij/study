package Synchron;

public class SingleThread implements Runnable {
    private Cup cup = null;

    public SingleThread(Cup cup) {
        this.cup = cup;
    }
    @Override
    public void run(){
        while(cup.waterAmount < cup.limit){
        pourWater();
        }
    }
    public synchronized void pourWater(){
        int water = (int)(Math.random()*10)*10;
        if(water +cup.waterAmount <= cup.limit){
            try{
                Thread.sleep(100);
                System.out.println("넣기전물의양 : "+ cup.waterAmount);
                cup.waterAmount = cup.waterAmount+water;
                System.out.println(" 컵에 물을 넣은 사람이름 : "+Thread.currentThread().getName());
                System.out.println("넣으려던 물의 양:  "+water);
                System.out.println("물을 양 : "+cup.waterAmount);
                System.out.println("==============================================================");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
