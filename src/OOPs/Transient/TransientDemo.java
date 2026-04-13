package OOPs.Transient;


import java.io.Serializable;

class A implements Serializable {
    int x = 10;
    transient String s = "Hello";
}


public class TransientDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);
        System.out.println(a.s);
    }
}
