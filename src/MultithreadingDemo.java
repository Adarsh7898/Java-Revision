


public class MultithreadingDemo {

    public static void main(String[] args) {
        Runnable t1= ()->{
            for(int i=1;i<=50;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };

        Runnable t2= ()->{
            for(int i=1;i<=50;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };

        Thread task1= new Thread(t1);
        Thread task2= new Thread(t2);

        task1.start();
        task2.start();
    }


}
