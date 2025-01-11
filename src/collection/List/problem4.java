package collection.List;

import java.util.LinkedList;
import java.util.List;

public class problem4 {
    public static void main(String[] args) {
        List<Character> list = new LinkedList<>();
        list.add('r');
        list.add('a');
        list.add('c');
        list.add('e');
        list.add('c');
        list.add('a');
        list.add('r');

        boolean palindrome = true;
        for (int i = 0; i <= list.size() / 2; i++) {
            if(list.get(i) != list.get(list.size() - i - 1)) {
                palindrome = false;
                break;
            }
        }

        if(palindrome) {
            System.out.println("The list represents a palindrome");
        } else {
            System.out.println("The list does not represents a palindrome");
        }
    }
}
