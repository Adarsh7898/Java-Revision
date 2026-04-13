package ExceptionHandling;

public class TrickyFlow {
    public static void main(String[] args) {
//        try {
//            int x = 10 / 0;
//        } catch (NullPointerException e) {
//            System.out.println("A");
//        } finally {
//            System.out.println("B");
//        }



        try {
            System.out.println("A");
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("B");
            throw e;
        } finally {
            System.out.println("C");
        }



    }


}
