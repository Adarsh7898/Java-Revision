package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
    public static void main(String[] args) throws InterruptedException {
//        List<Integer> list = new ArrayList<>();
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Runnable task1 = ()->{
            for(int i=1;i<=1000;i++) list.add(i);
        };

        Runnable task2 = ()->{
            for(int i=1;i<=1000;i++) list.add(i*10);
        };

        Thread t1= new Thread(task1);
        Thread t2= new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(list);
    }
}
