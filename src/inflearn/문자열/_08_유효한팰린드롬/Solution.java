package inflearn.문자열._08_유효한팰린드롬;

import java.util.Scanner;

public class Solution {
    public String solution(String str) {
        String answer = "NO";
        //A부터 Z까지가 아닌 것들 제거(알파벳만 뽑아내기)
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(s.solution(str));
    }
}
