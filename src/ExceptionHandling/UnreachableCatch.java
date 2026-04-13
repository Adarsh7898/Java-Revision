package ExceptionHandling;

public class UnreachableCatch {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("A");
        }
//        catch (ArithmeticException e) {
//            System.out.println("B");
//        }

    }
}
