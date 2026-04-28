package CollectionFramework.List.Stack;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println(  stack.peek());

        stack.pop();

        System.out.println(stack.peek());

        stack.add(5);

        System.out.println(stack.search(5));


    }

}
