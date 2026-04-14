package Generics;

class StudentPair<K,V>{
    K roll;
    V name;

    StudentPair(K roll, V name){
        this.roll = roll;
        this.name= name;
    }


    @Override
    public String toString() {
        return "StudentPair{" +
                "roll=" + roll +
                ", name=" + name +
                '}';
    }
}

class ClassroomPair<K,V>{
    K key;
    V value;

    ClassroomPair(K key, V value){
        this.key=key;
        this.value=value;
    }

    @Override
    public String toString() {
        return "ClassroomPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}



public class GenericsWithMultipleParameters {
    public static void main(String[] args) {

        StudentPair<Integer,String> studentRollAndName= new StudentPair<>(9,"Adarsh Goyal");
        ClassroomPair<String,Integer> departmentAndClass = new ClassroomPair<>("CSIT",349);

        System.out.println(studentRollAndName);
        System.out.println(departmentAndClass);

    }
}
