package inflearn.문자열._02_대소문자변환;

import java.util.Scanner;


//아스키코드로 풀이하기(대문자는 65~90, 소문자는 97~122)
public class Solution2 {
    public String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()) {
            if(x >= 97 && x <= 122) //소문자일경우
                answer += (char) (x - 32); //ex 97 - 32 == 65 소문자로 대문자로 변환
            else
                answer += (char) (x + 32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution.solution(str));
    }
}
