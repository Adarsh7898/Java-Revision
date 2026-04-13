package ExceptionHandling;

public class UsingThrow {
    public static void main(String[] args) {
        int age=15;
        try{
            if(age<18);
            throw new RuntimeException("Under eighteen");
        }catch (Exception e){
            System.out.println("");
        }
    }
}
