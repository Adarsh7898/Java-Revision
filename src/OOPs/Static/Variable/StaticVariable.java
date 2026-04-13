package OOPs.Static.Variable;

class A{
    static int x=10;
    int y;
    void setX(int y){
        this.y=y;
    }
    int  getX(){
        return y;
    }

}



public class StaticVariable {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        a.setX(20);
        System.out.println("Object A: ");
        System.out.println(" Static variable:"+A.x);
        System.out.println(" Instance variable:"+a.getX());

        System.out.println("------------------------------------------------------------------------------------");

        b.setX(30);
        System.out.println("Object B: ");
        System.out.println(" Static variable:"+b.x);
        System.out.println(" Instance variable:"+b.getX());
    }
}
