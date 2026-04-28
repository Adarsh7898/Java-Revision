package CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class ToArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //Storing this list as an array

        Object[] arr =  list.toArray();
        for(Object a : arr)
        System.out.println(a);

    }
}
