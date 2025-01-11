package collection.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class problem3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.addAll(list); //list에 있는 모든 요소에 중복 제거하고 추가
        System.out.println(set.stream().toList());
    }
}
