package collection.List;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class problem2 {
    public static void main(String[] args) {
        /*List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Integer popped = list.get(list.size()-1);
        System.out.println("Popped: " + popped);
        list.remove(list.size()-1);

        System.out.print("[");
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i == 1) {
                System.out.print(" , ");
            } else {
                System.out.print("]");
            }
        }*/
        LinkedList<Integer> stack = new LinkedList<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop
        int poppedElement = stack.pop();
        System.out.println("Popped: " + poppedElement);

        // Display stack
        System.out.println(stack);
    }
}
