package Generics;

class BoxObject{
    Object data;

    BoxObject(Object data){
        this.data=data;
    }

    Object getData(){
        return data;
    }
}

public class UsingObjectClass {
    public static void main(String[] args) {

        BoxObject boxObject=new BoxObject("Hello");
        System.out.println(boxObject.getData());

//        But if I want to store a result in the variable it wil require typecasting

//        BoxObject str = boxObject.getData();
        String str = (String) boxObject.getData();
        System.out.println(str);


    }

}
