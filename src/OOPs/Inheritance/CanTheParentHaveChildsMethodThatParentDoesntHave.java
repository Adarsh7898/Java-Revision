package OOPs.Inheritance;

//ANSWER: NO

class A{
    int x=10;
    void show(){
        System.out.println(x);
    }
}

class B extends A{
    int y=20;
    void show(){
        System.out.println(x);
    }

    void hello(){
        System.out.println("Hello");
    }
}

public class CanTheParentHaveChildsMethodThatParentDoesntHave {
    public static void main(String[] args) {
        B a = new B();
        a.hello();
        System.out.println(a);
    }
}
