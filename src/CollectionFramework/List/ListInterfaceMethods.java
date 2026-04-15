package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods {
    public static void main(String[] args) {

        List list = new ArrayList();

//      Add at the end
        list.add("Name : Adarsh");
        list.add("Name : Bhavya Jain");
        list.add("Name : Adarsh Goyal");

//      Add at the index
        list.add(0,"Roll : 09");

//      Get element by index
        System.out.println(list.get(0));

//      Replace element at index
        list.set(1,"Name : Adarsh Goyal");

//      To get the first index of an element
        System.out.println("First index of Name : Adarsh Goyal : "+list.indexOf("Name : Adarsh Goyal"));

//      To get the last index of an element
        System.out.println("Last  index of Name : Adarsh Goyal : "+list.lastIndexOf("Name : Adarsh Goyal"));

//      contains(): uses the equals method internally....
        System.out.println(list.contains("Name : Adarsh Goyal"));

//      remove by index
        list.remove(0);

//      remove by value
        list.remove("Name : Adarsh Goyal");



        System.out.println(list);

    }
}
