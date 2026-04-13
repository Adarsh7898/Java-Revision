package OOPs.Interfaces;

public interface Car {
    int x=10;
    void getX();

    default void steering(){
        System.out.println("Yes I have steering");
    }

}
