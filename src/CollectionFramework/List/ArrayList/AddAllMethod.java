package CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class AddAllMethod {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList list2= new ArrayList();

        list2.add(100);

//      Add at the end of the arraylist
//        list2.addAll(list1);

//      Add at a particular index
        list2.addAll(0,list1);

        System.out.println(list2);
    }
}
