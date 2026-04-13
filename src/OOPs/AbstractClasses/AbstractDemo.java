package OOPs.AbstractClasses;

 abstract class  A {
     void show(){
        System.out.println("Abstract class can have zero abstract methods");
    }

    abstract void display();
}

class B extends A{
    public void display(){
        System.out.println("Now this is an abstract class ");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
//        b.show();

        b.display();
    }
}
