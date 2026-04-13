package OOPs.Static.PolymorphismStatic;


class A{
    static void greet(){
        System.out.println("Hello");
    }
}

class B extends A{
    static void greet(){
        System.out.println("Hi.....");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        B.greet();
        A.greet();
    }
}

