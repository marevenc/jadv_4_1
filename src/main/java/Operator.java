import java.util.concurrent.BlockingQueue;

public class Operator extends Thread{
    BlockingQueue<String> calls;
    int talkingTime = 3000;

    public Operator(BlockingQueue<String> calls){
        this.calls = calls;
    }

    public void run(){
        while (true){
            try {
                String call = calls.poll();
                if(call == null){
                    break;
                }
                System.out.println("Принят звонок " + call);
                Thread.sleep(talkingTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
