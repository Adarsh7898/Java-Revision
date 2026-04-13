package OOPs;

class Aa{
    Aa(){
        System.out.println("Constructor");
    }
    public String Aa(){
        return "Hello";
    }
}

public class CanAMethodAndAConstructorHaveSameName {
    public static void main(String[] args) {
        Aa a = new Aa();
        System.out.println(a.Aa());
    }
}
