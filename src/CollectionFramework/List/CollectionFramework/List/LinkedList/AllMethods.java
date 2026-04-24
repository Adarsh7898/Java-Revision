package CollectionFramework.List.CollectionFramework.List.LinkedList;

import java.util.Collection;
import java.util.LinkedList;

public class AllMethods {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

//      Add at the end
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

//      Add at the index O(n)
        linkedList.add(0,0);

//      Add at the first index
        linkedList.addFirst(-10);

//      Add at the last index
        linkedList.addLast(50);

//      Fetching an element from any index.
        System.out.println(linkedList.get(3));

//      Set the value at any index the index has to be present in the list otherwise the code will give the error the run time.....
        linkedList.set(0,-100);

//      Remove the first value
        linkedList.remove();

//      Remove the value from any index
        linkedList.remove(0);

        linkedList.addFirst(0);

//      Remove the first element
        linkedList.removeFirst();

//      Remove the last element)(Comes from Deque interface)
        linkedList.removeLast();

//      offer(E e)-> Adds the element at the tail of the Deque
        linkedList.offer(50);

//      poll()-> Removes the element from the head of the Deque
        linkedList.poll();

//      peek()-> Returns the element from the head of the Deque
        System.out.println(linkedList.peek() );

//      push()-> Add the element at the beginning
        linkedList.push(10);
        linkedList.push(0);

//      remove()-> Removes the first element from the list
        linkedList.remove();


        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }


        System.out.println(linkedList);



        Collection<Integer> li = new LinkedList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);

//        li.remove();
//        li.remove();

        System.out.print(li);
    }

    }


