package CollectionFramework.List.ArrayList;

import OOPs.Encapsulation.A;

import java.util.ArrayList;


public class CloneMethodInArrayList {
    public static void main(String[] args) {

        ArrayList<StringBuilder> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(new StringBuilder("Hello"));
        }
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list.clone();

        list.set(0, list.get(0).append(" Hanji Good Morning, Good ETM mera naam Jyoti hai me ballamgarh se belong karti hu mera bhi yahan se second level ho gaya hai jiski total income nau hajar rupay mere khaate me aa chuki hai...."));

        System.out.println(list);
        System.out.println(list2);
    }

}
