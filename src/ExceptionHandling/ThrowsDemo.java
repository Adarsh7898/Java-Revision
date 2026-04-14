package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {

    public void divide() throws FileNotFoundException {
        FileReader fr = new FileReader("a.txt");
    }

    public void caller()  {
        try{
            divide();
        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        ThrowsDemo ob = new ThrowsDemo();
        ob.caller();
    }
}
