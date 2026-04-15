package CollectionFramework.List.CollectionFramework.List.ArrayList;

import OOPs.Encapsulation.A;

import java.beans.PropertyEditorManager;
import java.util.ArrayList;

public class RemoveAllAndRetainAllMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);
        list2.add(11);


//      removeAll() - Removes all the elements from the list that are present in the otherList(passed in parameters)
//      list1.removeAll(list2);
//      System.out.println(list1);

//      retainAll() - Keeps all the elements that are common in both the lists

        list1.retainAll(list2);
        System.out.println(list1);


    }


}
