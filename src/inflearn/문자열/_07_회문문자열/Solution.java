package inflearn.문자열._07_회문문자열;

import java.util.Scanner;

public class Solution {
    public String solution(String str) {
        String answer = "YES";
        str=str.toUpperCase();
        int len = str.length();
        for(int i = 0 ; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len - i - 1)) return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(s.solution(str));
    }
}
