package OOPs.Interfaces;

public interface Truck {
    default void steering(){
        System.out.println("Yes I have steering");
    }
}
