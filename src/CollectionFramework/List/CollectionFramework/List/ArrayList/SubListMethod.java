package CollectionFramework.List.CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class SubListMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);


//      It only returns the view/window not the list
//      firstIndex takes part in the sublist, last index doesn't....
        System.out.println(list1.subList(1,5));

//      Dangerous- If we make any change in the original list, the sublist will also get affected.
//        list1.add(2,1);
//        System.out.println(list1.subList(1,5));


//      Best usage - create a separate list to store the
        ArrayList<Integer> sub = new ArrayList<>();
        list1.addAll(list1.subList(1,5));
        System.out.println();

//      Now even if we modify the list1, the sub will not get affected
        list1.add(2,1);
        System.out.println(list1);


    }



}
