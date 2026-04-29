package CollectionFramework.Queue.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(1);

        bq.add(1);


        //Producer
        new Thread(() -> {
            try {
                for(int i=1;i<=1000;i++){
                    bq.put(i);
                }
            } catch (Exception e) {
            }
        }).start();


        //Consumer
        new Thread(() -> {
            try {
                for(int i=1;i<=100;i++){
                    System.out.println(bq.take());
                }

            } catch (Exception e) {
            }
        }).start();
    }
}