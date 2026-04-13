package WrapperClass;

public class CheckingToString {
    public static void main(String[] args) {
        Integer i = 20000;
        System.out.println(i.toString().length());
        System.out.println(i.toString().concat(" Hai"));
    }
}
