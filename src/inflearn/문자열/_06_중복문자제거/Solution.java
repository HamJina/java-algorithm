package inflearn.문자열._06_중복문자제거;

import java.util.Scanner;

public class Solution {
    public String solution(String str) {
        String answer="";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
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
