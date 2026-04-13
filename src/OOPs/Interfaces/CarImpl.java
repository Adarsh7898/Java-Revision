package OOPs.Interfaces;

import java.beans.DesignMode;

class Demo implements Car{
    @Override
    public void getX() {
        int value = Car.x;
        System.out.println("The value of x is: "+value);
    }


}

public class CarImpl{

    public static void main(String[] args) {
        Demo d = new Demo();
        d.getX();
    }

}


