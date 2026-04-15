package CollectionFramework.List.CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class TrimToCapacity {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

//        As we know the defualt capacity is 10
//        As soon as the 11th element the capacity becomes 15, but the size is still 11
//        So it's a wastage of memory
        for(int i=1; i<=20;i++){
            list.add(i);
        }

//        Using trimToSize method to match the size and capacity
        list.trimToSize();

    }
}
