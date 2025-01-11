package collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class problem5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("cherry");
        list.add("apple");

        /*int count = 0;
        for (String s : list) {
            if(s == "apple")
                count++;
        }*/
        int count = Collections.frequency(list, "apple");
        System.out.println("apple appears " + count + " times");
    }
}
