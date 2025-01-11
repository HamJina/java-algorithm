package inflearn.문자열._04_단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

//StringBuilder의 reverse사용하기
public class Solution {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        for(String x : solution.solution(n, str)) {
            System.out.println(x);
        }
    }
}
