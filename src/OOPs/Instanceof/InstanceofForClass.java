package OOPs.Instanceof;


class A{

}

class B extends A{

}

public class InstanceofForClass {
    public static void main(String[] args) {
        A a =new A();
        A b= new A();
        B bb= new B();
        A aa= new B();
        System.out.println(a instanceof A);
        System.out.println(b instanceof A);
        System.out.println(bb instanceof B);
        System.out.println(bb instanceof A);
        System.out.println(aa instanceof B);
    }
}
