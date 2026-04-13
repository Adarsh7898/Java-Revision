package OOPs.Static.Block;

class A{

    static{
        System.out.println("Static block executed");
    }

    A(){
        System.out.println("Constructor executed");
    }

    void run(){
        System.out.println("Non static method ran");
    }

}


public class StaticBlock {
    public static void main(String[] args) {
//        Static block is executed only once
        A a = new A();
        A b = new A();
        A c = new A();
    }
}
