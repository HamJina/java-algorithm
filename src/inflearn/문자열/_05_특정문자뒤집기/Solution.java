package inflearn.문자열._05_특정문자뒤집기;

import java.util.Scanner;

public class Solution {
    public String solution(String str) {
        String answer="";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution.solution(str));
    }
}
