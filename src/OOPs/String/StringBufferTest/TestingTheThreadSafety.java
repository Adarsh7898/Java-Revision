package OOPs.String.StringBufferTest;

public class TestingTheThreadSafety {

    public static void main(String[] args) throws InterruptedException {

        StringBuffer sb = new StringBuffer();

        Runnable task = ()->{
            for(int i=0;i<1000;i++){
                sb.append("A");
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected length for the string is 2000");
        System.out.println("Actual length calculated by program is "+sb.length());
    }
}