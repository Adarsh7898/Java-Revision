package CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class EnsureCapacityMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(10);

        for(int i=1;i<=11;i++){
            list.add(i);
        }

        for(Integer i : list){
            System.out.println(i);
        }
    }
}
