package collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 학생들의 이름을 ArrayList에 추가하고, 특정 이름을 검색하거나 삭제하는 프로그램을 작성하세요.
*/
public class problem1 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(25);
        ints.add(5);
        ints.add(40);

        //int max = Collections.max(ints);
        int max = ints.get(0);
        for (Integer i : ints) {
            if(max < i)
                max = i;
        }

        System.out.println("Maximum number: " + max);
    }
}
