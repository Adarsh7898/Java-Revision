package OOPs.String.Immutability;


import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Immutability extends AbstractCollection {

    @Override
    public String toString(){
        return this.getClass()+"@"+this.hashCode();
    }

    public static void main(String[] args) {
        String s = "Adarsh";
//        s="Adarsh Goyal";
//        s="I am Adarsh Goyal";
       String newObj=s.concat(" hoon");
        System.out.println(s);
        System.out.println(newObj);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.toString());
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
