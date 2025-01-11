package inflearn.문자열._02_대소문자변환;

import java.util.Scanner;

public class Solution {
    public String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) //소문자일경우
                answer += Character.toUpperCase(x); //문자를 누적해서 더해도됨
            else //대문자일경우
                answer += Character.toLowerCase(x);
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
