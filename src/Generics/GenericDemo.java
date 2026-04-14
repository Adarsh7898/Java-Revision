package Generics;

class Student{
    int roll=9;
    String name ="Adarsh Goyal";
    String department = "CSIT";

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

class Car{
    String brand="Mercedes";
    String model="Benz";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

class Box<T>{
    T box;

    public Box(T box) {
        this.box=box;
    }


    @Override
    public String toString() {
        return "Box contains: " + box;
    }

}

public class GenericDemo<T> {
    public static void main(String[] args) {

        Student student=new Student();
        Car car= new Car();

        Box<Student> studentBox = new Box<>(student);
        Box<Car>     carBox     = new Box<>(car);

        System.out.println(studentBox);
        System.out.println(carBox);


    }
}
