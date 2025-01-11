package inflearn.문자열._04_단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            char[] s = x.toCharArray();
            //값 교환하기
            int lt = 0;
            int rt = x.length() - 1;
            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String  tmp = String.valueOf(s); //문자배열 -> String화
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
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
