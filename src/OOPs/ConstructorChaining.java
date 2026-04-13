package OOPs;

class Demo{
    int x;
    protected Demo(){
        this(10);
        System.out.println("Hello");
    }
   protected Demo(int x){
        this.x=x;
        System.out.println("Value of x: "+x);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Demo demo = new Demo();
    }
}
