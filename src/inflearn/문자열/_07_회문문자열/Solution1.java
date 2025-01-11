package inflearn.문자열._07_회문문자열;

import java.util.Scanner;

//StringBuilder사용
public class Solution1 {
    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(s.solution(str));
    }
}
