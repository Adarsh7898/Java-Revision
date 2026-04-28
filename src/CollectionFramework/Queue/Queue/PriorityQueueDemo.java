package CollectionFramework.Queue.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqPriorityToTheSmallest = new PriorityQueue<>();
        pqPriorityToTheSmallest.add(30);
        pqPriorityToTheSmallest.add(50);
        pqPriorityToTheSmallest.add(10);

        System.out.println(pqPriorityToTheSmallest);

        PriorityQueue<Integer> pqPriorityToTheLargest = new PriorityQueue<>(Collections.reverseOrder());
        pqPriorityToTheLargest.add(20);
        pqPriorityToTheLargest.add(30);
        pqPriorityToTheLargest.add(100);
        pqPriorityToTheLargest.add(10);
        System.out.println(pqPriorityToTheLargest);

    }
}
