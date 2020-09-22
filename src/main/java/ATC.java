import java.util.concurrent.BlockingQueue;

public class ATC extends Thread {
    int numberOfCalls;
    int frequency = 1000;
    BlockingQueue<String> calls;
    StringGenerator stringGenerator = new StringGenerator();

    public ATC(BlockingQueue<String> calls, int numberOfCalls){
        this.calls = calls;
        this.numberOfCalls = numberOfCalls;
    }

    public void run(){
        int i = 0;
        while (i < numberOfCalls){
            try {
                calls.put(stringGenerator.generateString());
                Thread.sleep(frequency);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
