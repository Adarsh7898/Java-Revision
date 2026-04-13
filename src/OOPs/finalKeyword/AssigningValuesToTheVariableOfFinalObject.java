package OOPs.finalKeyword;


class B{
    int x;
}

public class AssigningValuesToTheVariableOfFinalObject {
    public static void main(String[] args) {
        final B b = new B();
        b.x=10;
        System.out.println(b.x);
    }
}
