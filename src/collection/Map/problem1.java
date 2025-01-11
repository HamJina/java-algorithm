package collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* 배열을 맵으로 전환
*/
public class problem1 {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> products = new HashMap<>();
        for (String[] product : productArr) {
            products.put(product[0], Integer.valueOf(product[1]));
        }

        Set<Map.Entry<String, Integer>> entries = products.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
        }
    }
}
