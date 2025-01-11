package collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* 값으로 검색
*/
public class problem4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> fruits = new ArrayList<>();
        for (String s : map.keySet()) {
            if(map.get(s) == 1000) {
                fruits.add(s);
            }
        }
        System.out.println(fruits);
    }

}
