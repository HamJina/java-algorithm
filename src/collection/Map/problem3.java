package collection.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* 같은 단어가 나타나는 수
*/
public class problem3 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] s = text.split(" ");

        Map<String, Integer> result = new HashMap<>();
        for (String string : s) {
            if(result.containsKey(string)) {
                result.put(string, result.get(string) + 1);
            } else {
                //아직 포함하지 않았다면 새로 생성
                result.put(string, 1);
            }
        }
        System.out.println(result);

    }
}
