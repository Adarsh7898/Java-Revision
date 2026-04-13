package ExceptionHandling;

class A{
    int display(){
        int x=10;
        try {

            return x;
        }

        finally {
//            return 50;
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println(new A().display());
    }
}
