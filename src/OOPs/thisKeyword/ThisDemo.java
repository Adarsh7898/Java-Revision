package OOPs.thisKeyword;
class A{
    int a = 10;
     static void display(){
        System.out.println("Hello");
    }


    public void hello(){
        System.out.println("Hellllllo");
    }

    public void show(){
//        System.out.println(this.display());

        this.hello();
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        new A().show();

    }

}
