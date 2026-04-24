package CollectionFramework.List.CollectionFramework.List.ArrayList;

import java.lang.reflect.Array;import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> it = list.iterator();


        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }

        //removing element and traversing in the same loop
        while(it.hasNext()){
            if(it.next()==5){
                it.remove();
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        //using for loo[p
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//            list.remove(i);
//            i--;
//        }
//        System.out.println(list);

//        best way
        for(int i=list.size()-1;i>=0;i--){
            list.remove(i);
        }
        System.out.println(list);
    }
}
