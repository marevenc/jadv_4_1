import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        int numberOfCalls = 60;
        int numberOfOperators = 3;
        BlockingQueue<String> calls = new ArrayBlockingQueue<String>(numberOfCalls);
        ATC atc = new ATC(calls, numberOfCalls);
        atc.start();

        Operator[] operators = new Operator[numberOfOperators];
        for(int i = 0; i < numberOfOperators; i++) {
            operators[i] = new Operator(calls);
            operators[i].start();
        }
    }
}
