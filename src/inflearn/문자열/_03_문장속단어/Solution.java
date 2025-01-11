package inflearn.문자열._03_문장속단어;

import java.util.Scanner;

//split사용하기
public class Solution {
    public String solution(String str) {
        String answer="";
        int m = Integer.MIN_VALUE; //가장 작은 값으로 초기화
        String[] s = str.split(" ");//띄워쓰기를 기준으로 단어 분리하기
        for(String x : s) {
            int len = x.length();
            if(len > m) {
                m = len; //최댓값 갱신
                answer = x; //최댓값 문자열 갱신
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.solution(str));
    }
}
